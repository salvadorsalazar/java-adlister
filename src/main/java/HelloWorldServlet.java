import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

//Hey tomcast , whwenever someone requests that url /hello , load and execute this servlet
//the webservelt annotation maps a url to a servlet and its code
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServerException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1 ><center>Hello, World!</center></h1>");

        //BONUS 1.
        String name = req.getParameter("name");
        if(req.getParameter("name") !=null ) {
            out.println("<h1>Hello , " + name + "</h1>");

        }else{
            out.println("<h1 ><center>Hello, World!</center></h1>");

        }

        out.println("<hr>");
        out.println("<h2 style='color:red'>Change font color of HTML webpage tag</h2>");
        out.println("<p> Enter :  style='color:red' ...in tag");


        out.println("<hr>");



        out.println("<hr>");
        out.println("<h4> Bonus\n" +
                "\n" +
                "Make the page say \"Hello, <name>!\" if name is passed as part of the query string (e.g. /hello?name=codeup), otherwise default to \"Hello, World!\".</h4>");

        out.println("<hr>");



    }
}









//public class HelloWorldServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
//
//    }

//
//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
//
//public class HelloWorldServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();;
//        out.println("<h1> Hello, World!</h1>");
//
//    }


//
// out.println("<h2 style ='background-color:coral'> @WebServlet(name = \"HelloWorldServlet\", urlPatterns = \"/\")\n" +
//         "\n" +
//         "public class HelloWorldServlet extends HttpServlet {" +
//         "    @Override" +
//         "    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServerException, IOException {\n" +
//         "        res.setContentType(\"text/html\");"+
//
//         "        out.println(\"<h1 style ='background-color:coral' >Hello, World!</h1>\");" +
//         "        out.println(\"<h2> \");" +
//
//         "    }");