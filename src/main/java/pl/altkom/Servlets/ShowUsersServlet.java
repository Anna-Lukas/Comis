package pl.altkom.Servlets;

import pl.altkom.Client;
import pl.altkom.dao.ClientDataDAO;
import pl.altkom.dao.ClientDataDAOImpl;

import javax.annotation.Resource;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/read_users")
public class ShowUsersServlet extends HttpServlet {

    @Resource(name ="jdbc:Comis")
    private DataSource ds;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();

        try {
            ClientDataDAO dao = new ClientDataDAOImpl();
            List clients = dao.readClientsData(ds);
            req.setAttribute("clients", clients);
            req.getRequestDispatcher("ShowUsers.jsp").forward(req,resp);


        } catch (Exception e) {
            throw new ServletException("Cannot delete user", e);
        }

    }


}


