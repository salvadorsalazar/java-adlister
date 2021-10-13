import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="counterServlet", urlPatterns = "/count")

public class counterServlet extends HttpServlet {
    public static int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if(req.getParameter("reset")!= null){
            count = 0;
            out.println("you have reset counter , counter is now :"+count);

        }else {
            count = count + 1;
            out.println("<h1> Page Counter : " + count + "</h1>");
        }
    }
}
