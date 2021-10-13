import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ParameterTestServlet", urlPatterns = "/parameterTest")
public class ParameterTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String word = req.getParameter("word");
        out.println("<h2> you entered " + word + "!</h2>");
    }

}




//
//import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import java.io.IOException;
//        import java.io.PrintWriter;
//
//@WebServlet(name="ParameterTestServlet", urlPatterns = "/parameterTest")
//public class ParameterTestServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        String word = request.getParameter("word");
//        out.println("<h2>You entered " + word + "!</h2>");
//    }
//}