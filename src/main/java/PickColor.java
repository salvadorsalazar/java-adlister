import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColor", urlPatterns = "/pick-color")


public class PickColor extends HttpServlet {
    @Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
    IOException{
        req.getRequestDispatcher("/pick-color.jsp").forward(req,res);
    }
//@Override


}
