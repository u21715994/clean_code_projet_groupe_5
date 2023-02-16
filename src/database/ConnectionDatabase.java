package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDatabase {
    private final static String databaseUrl = "";
    private final static String username = "";
    private final static String password = "";
    public static void createDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Connection connection = DriverManager.getConnection(databaseUrl);
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);
        Statement statement = connection.createStatement();
        statement.executeQuery("INSERT INTO users (name, solde) VALUES (name, 15)");
        statement.executeQuery("INSERT INTO decks (user_id) VALUES (user_id)");
        statement.executeQuery("SELECT * FROM users WHERE id = id");
        statement.executeQuery("SELECT * FROM decks WHERE user_id = id");
    }
}
