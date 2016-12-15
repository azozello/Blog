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
import java.util.ArrayList;

@WebServlet("/doLogin")
public class doLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ArrayList<User> users = DataBase.getUsers();
        User check = new User(req.getParameter("login"), req.getParameter("pass"));
        if (users.contains(check)){
            session.setAttribute("user", check.getLogin());
            req.getRequestDispatcher("AllArticles").forward(req,resp);
        } else {
            resp.sendRedirect("login.jsp");
        }
    }
}