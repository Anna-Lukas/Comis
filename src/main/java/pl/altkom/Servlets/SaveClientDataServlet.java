package pl.altkom.Servlets;

import pl.altkom.Client;
import pl.altkom.dao.ClientDataDAO;
import pl.altkom.dao.ClientDataDAOImpl;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/add_user")
public class SaveClientDataServlet extends HttpServlet {

    @Resource(name = "jdbc:Comis")
    private  DataSource ds;
    // to jest to pole które zastępują te trzy liniki które wcześniej były w doPost
    //    InitialContext initCtx = new InitialContext();
    //            Context context = (Context) initCtx.lookup("java:comp/env");
    //            DataSource ds = (DataSource) context.lookup(getServletContext()
    //                    .getInitParameter("dataSource"));

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Client client = new Client();

        client.setFirstName(req.getParameter("firstName"));
        client.setLastName(req.getParameter("lastName"));
        String ageString = (req.getParameter("age"));
        client.setAge(Integer.parseInt(ageString));
        client.setRegion(req.getParameter("region"));
        client.setSex(req.getParameter("sex"));

        ClientDataDAO dao = new ClientDataDAOImpl();
        try {

            dao.saveClientData(client, ds);
            req.setAttribute("bla bla", client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        PrintWriter out = resp.getWriter();
        out.println("<HTML><HEAD>");
        out.println("<TITLE>UserAdd</TITLE>");
        out.println("</HEAD><BODY>");
        out.println("<H3> Dodano użytkownika</H3>");
        out.println("<a href=\"userForm.html\">Dodaj użytkownika</a>");
        out.println("</BODY></HTML>");


    }
}

