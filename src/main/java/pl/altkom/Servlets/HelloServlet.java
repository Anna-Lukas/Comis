package pl.altkom.Servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/hello")
    public class HelloServlet extends HttpServlet {
        @Override
        public void service(HttpServletRequest request,
                            HttpServletResponse response)
                throws IOException {

            PrintWriter pw = response.getWriter();

            pw.println("<HTML><HEAD>");
            pw.println("<meta charset=\"UTF-8\">");
            pw.println("<TITLE>Hello</TITLE>");
            pw.println("</HEAD><BODY>");
            pw.println("<H3>Hello Ania!</H3>");
            pw.println("</BODY></HTML>");
        }


    }

