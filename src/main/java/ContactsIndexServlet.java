import entity.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/contacts")
//@WebServlet(name = "ContactsIndexServlet", urlPatterns = "/contacts")

public class ContactsIndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // pass the string "Justin" to the view
        String name = "Justin";

        // assume that this being read from a DB
        List<Contact> contacts = new ArrayList<>(Arrays.asList(
                new Contact(1, "Fred Smith", "fred@email.com", "1122 Fred Way", "5554442222", true),
                new Contact(2, "Sally Smith", "sally@email.com", "1122 Sally Way", "5554442222", true),
                new Contact(3, "Cathy Smith", "cathy@email.com", "1122 Cathy Way", "5554441111", true),
                new Contact(4, "Bob Smith", "bob@email.com", "1122 Bob Way", "5554446666", false)
        ));

        request.setAttribute("name", name);
        request.setAttribute("contacts", contacts);

        request.getRequestDispatcher("/contacts.jsp").forward(request, response);
    }
}