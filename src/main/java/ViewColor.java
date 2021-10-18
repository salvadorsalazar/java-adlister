import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColor", urlPatterns = "/view-color")


public class ViewColor extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    String color = req.getParameter("color");
        req.setAttribute("yourColor",color);
        req.getRequestDispatcher("/view-color.jsp").forward(req,res);

    }
}
