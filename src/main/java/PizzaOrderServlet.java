import model.PizzaOrder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
            IOException{

        req.getRequestDispatcher("/pizza-order.jsp").forward(req,res);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

String crustDescription = req.getParameter("crust");
String sauceDescription = req.getParameter("sauce");
String toppingsDescription = Arrays.toString(req.getParameterValues("toppings"));
String address = req.getParameter("address");
Date createdAT = new Date();
        //create pizza order object to save
        PizzaOrder pizza0 = new PizzaOrder(
                crustDescription,
sauceDescription,
                toppingsDescription,
               address,
               createdAT
        );

        System.out.println(pizza0);


                        //        String crust = req.getParameter("crust");
                        //        String sauce = req.getParameter("sauce");
                        //        String size = req.getParameter("size");
                        ////        String toppings = req.getParameter("toppings");
                        //
                        //        String[] toppings = req.getParameterValues("toppings");
                        //
                        //        for (String topping:toppings){
                        //            System.out.println(topping);
                        //            System.out.println(" ");
                        //        }
                        //
                        //        String address = req.getParameter("address");
                        //        System.out.println(crust);
                        //        System.out.println(sauce);
                        //        System.out.println(size);
                        //        System.out.println(address);




//        System.out.println(toppings);



//        System.out.println(Arrays.toString(toppings));



res.sendRedirect("/hello");

        req.getRequestDispatcher("/pizza-order.jsp").forward(req,res);

    }
}