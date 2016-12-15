package servlets;

import classes.DataBase;
import classes.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CreateNewUser")
public class CreateNewUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String pass1 = req.getParameter("pass1");
        String pass2 = req.getParameter("pass2");
        if (pass1.equals(pass2)){
            DataBase.insertUser(login,pass1);
            HttpSession session = req.getSession();
            session.setAttribute("user", login);
            req.getRequestDispatcher("AllArticles").forward(req,resp);
        } else {
            resp.sendRedirect("newuser.jsp");
        }
    }
}
