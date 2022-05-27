package controller.login;

import dao.AccountDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerifyController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AccountDAO accountDao = new AccountDAO();
        
        String email = request.getParameter("email");
        String fname = request.getParameter("f-name");
        String lname = request.getParameter("l-name");
        boolean gender = request.getParameter("gender").equals("Male");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        
        accountDao.insertAccount(email, fname, lname, gender, phone);
        
        int accountId = accountDao.getAccountIdByEmail(email);

        accountDao.insertPassword(accountId, password);
        
        //request.getSession().setAttribute("account", account);

        response.sendRedirect("home");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
