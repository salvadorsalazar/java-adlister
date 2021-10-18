import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        // if the name is null, it means that "name" was not present in the query
        // string, and here we'll provide a default value
        if (name == null) {
            name = "World!";
        } else if (name.equals("bgates")) {
            response.sendRedirect("https://microsoft.com");
            return;
        }
        // pass the value of the name variable to the view, and send the request
        // forward to the hello.jsp file
        request.setAttribute("name", name);
        request.getRequestDispatcher("src/main/webapp/hello.jsp").forward(request, response);
    }

}
