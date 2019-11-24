package pl.altkom;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ControllerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws SecurityException, IOException {
        String name = req.getParameter("name");
        PrintWriter pw = res.getWriter();

        pw.println("<HTML><HEAD></HEAD><BODY>");
        pw.println("<H4> HEllo");
        if (name != null) {
            pw.println(name);

        } else {
            pw.print("world");
        }
        pw.println("!<H4>");
        pw.println("<a href=\"makeForm.html\">Marka</a>");
        ServletContext context = this.getServletContext();
        String email = context.getInitParameter("adres_email_tworcy");
        pw.println("Adres email twórcy strony: " + email);
        pw.println("</BODY></HTML>");

    }
}
