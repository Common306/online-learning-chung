
package controller.login;

import dao.AccountDAO;
import java.io.IOException;
import java.sql.Timestamp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckExpiredController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        Timestamp timeNow = new Timestamp(System.currentTimeMillis());
        Timestamp timeModify = new AccountDAO().getTimeModify(email);
        
        // link change password expired 1 minute
        if(timeNow.getTime() - timeModify.getTime() >= 60000) {
            response.sendRedirect("404");
        }
        else {
            response.getWriter().print("OK");
//            response.sendRedirect("reset-password");
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
