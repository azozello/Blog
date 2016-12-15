package servlets;

import classes.Article;
import classes.DataBase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/AllArticles")
public class AllArticles extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ArrayList<Article> allArticles = DataBase.getArticles();
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h3><a href='newarticle.jsp'>New Article</a></h3>");
        for (int i=0;i<allArticles.size();i++){
            printWriter.println("<h3><a href='showarticle.jsp?id="+allArticles.get(i).getID()
                    +"'>"+allArticles.get(i).getTitle()+"</a></h3>");
        }
    }
}
