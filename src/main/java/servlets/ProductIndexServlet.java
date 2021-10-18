package servlets;

import dao.DaoFactory;
import dao.ProductInMemoryDao;
import model.Product;
import model.Products;
//controller//
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/products")
public class ProductIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Use Model to get all the products to send to the view

        Products productsDao = DaoFactory.getProductsDao();

        List<Product> products = productsDao.findAll();

        request.setAttribute("products", products);
        request.getRequestDispatcher("products.jsp").forward(request, response);

    }
}