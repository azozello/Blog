package servlets;

import classes.Article;
import classes.DataBase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/CreateNewArticle")
public class CreateNewArticle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Article article = new Article(req.getParameter("title"), req.getParameter("text"));
        ArrayList<Article> articles = DataBase.getArticles();
        if (!articles.contains(article)){
            DataBase.insertArticle(article);
            req.getRequestDispatcher("AllArticles").forward(req,resp);
        }
    }
}
