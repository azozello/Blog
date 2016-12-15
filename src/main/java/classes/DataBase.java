package classes;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {

    private final static String URL = "jdbc:mysql://localhost:3306/lnp";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    public static void deleteArticle(String title){
        Connection connection;
        Statement statement;
        try {
            String query = "DELETE FROM articles WHERE TITLE = '"
                    +title+"';";
            Class.forName("com.mysql.jdbc.Driver");
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
            statement.close();
            System.out.println("SUCCESS");
        } catch (Exception e){
            System.out.println("FAIL");
            e.printStackTrace();
        }
    }

    public static void insertArticle(Article article){
        Connection connection;
        Statement statement;
        try {
            String query = "INSERT INTO articles(TITLE, TEXT) VALUES('"
                    +article.getTitle()+"', '"+article.getText()+"');";
            Class.forName("com.mysql.jdbc.Driver");
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
            statement.close();
            System.out.println("SUCCESS");
        } catch (Exception e){
            System.out.println("FAIL");
            e.printStackTrace();
        }
    }

    public static Article getArticle(int id){

        Article article = new Article();
        Connection connection;
        Statement statement;
        String query = "select ID,TITLE,TEXT from articles where ID = '"+id+"';";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                article.setID(resultSet.getInt(1));
                article.setTitle(resultSet.getString(2));
                article.setText(resultSet.getString(3));
            }
            connection.close();
            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return article;
    }

    public static ArrayList<Article> getArticles(){

        ArrayList<Article> articles = new ArrayList<Article>();
        Connection connection;
        Statement statement;
        String query = "SELECT * FROM articles;";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                articles.add(new Article(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3)));
            }
            connection.close();
            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return articles;
    }

    public static ArrayList<User> getUsers(){

        ArrayList<User> allUsers = new ArrayList<User>();
        Connection connection;
        Statement statement;
        String query = "SELECT * FROM users";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String login = resultSet.getString(2);
                String password = resultSet.getString(3);
                allUsers.add(new User(login,password));
            }
            connection.close();
            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return allUsers;
    }

    public static void insertUser(String login, String password){
        Connection connection;
        Statement statement;
        try {
            String query = "INSERT INTO users(LOGIN, PASSWORD) VALUES('"
                    +login+"', '"+password+"');";
            Class.forName("com.mysql.jdbc.Driver");
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
            statement.close();
            System.out.println("SUCCESS");
        } catch (Exception e){
            System.out.println("FAIL");
            e.printStackTrace();
        }
    }

    public static void deleteUser(String login){
        Connection connection;
        Statement statement;
        try {
            String query = "DELETE FROM users WHERE LOGIN = '"
                    +login+"';";
            Class.forName("com.mysql.jdbc.Driver");
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
            statement.close();
            System.out.println("SUCCESS");
        } catch (Exception e){
            System.out.println("FAIL");
            e.printStackTrace();
        }
    }
}

