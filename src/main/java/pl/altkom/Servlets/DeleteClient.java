package pl.altkom.Servlets;

import pl.altkom.dao.ClientDataDAO;
import pl.altkom.dao.ClientDataDAOImpl;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete_client")
public class DeleteClient extends HttpServlet {
    @Resource(name = "jdbc:Comis")
    DataSource dataSource;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String client = req.getParameter("client");
        getServletContext().log(client);
        String firstName, lastName;
        String[] splittedClient = client.split(" ");
        firstName = splittedClient[0];
        lastName = splittedClient[1];
        ClientDataDAO dao = new ClientDataDAOImpl();
        try {
            dao.removeClient(firstName, lastName, dataSource);
            req.getRequestDispatcher("read_users").forward(req, res);
        } catch (Exception e) {
            throw new ServletException("Cannot delete user", e);
        }

    }
}
