package pl.altkom.Servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/process")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        ServletContext context = getServletContext();
        String make = req.getParameter("marka");
        System.out.printf(make);

        if (make.equals("Opel")) {
            resp.sendRedirect("http://opel.pl");
        } else if (make.equals("Fiat")) {
            resp.sendRedirect("http://fiat.pl");
        } else if (make.equals("Audi")) {
            resp.sendRedirect("http://audi.pl");
        } else {
            PrintWriter pw = resp.getWriter();
            pw.println("ERROR");
        }
    }
}

