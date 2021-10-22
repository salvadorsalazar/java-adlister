
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection;// = null;
// private Config config = new Config(); created in
    private List<Ad> ads;

    public MySQLAdsDao(Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException  throwables){
            throwables.printStackTrace();
        }
    }
    @Override
    public List<Ad> all() {
        Statement stmt = null;
        List<Ad> ads = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return ads;
    }

    @Override
    public Long insert(Ad ad) {

        String sql = String.format("insert into ads (user_id, title, description) values (%d, '%s', '%s')",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription());


        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0L;
    }




}