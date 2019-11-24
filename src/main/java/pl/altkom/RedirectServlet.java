package pl.altkom;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RedirectServlet extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    String make = req.getParameter("marka");

    if      (make.equals("Opel")) {
        resp.sendRedirect("http://opel.pl");
    }else if(make.equals("Fiat")) {
        resp.sendRedirect("http://fiat.pl");
    }else if(make.equals("Mazda")) {
        resp.sendRedirect("http://mazda.pl");
    }else if(make.equals("Ford")){
        resp.sendRedirect("http://ford.pl");
    }
    PrintWriter pw = resp.getWriter();

    pw.println("<HTML><HEAD>");
    pw.println("<TITLE>RedirectServlet</TITLE>");
    pw.println("</HEAD></BODY>");
    }
}

