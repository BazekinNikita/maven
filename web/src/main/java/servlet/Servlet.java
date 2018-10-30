package servlet;
import masterService.MasterService;
import model.Master;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/master")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        System.out.println(id);
        Master master = MasterService.getInstance().getMaster(id);
        req.setAttribute("master_name", master);
        System.out.println(id);
        getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/master.jsp")
                .forward(req, resp);

    }
}
