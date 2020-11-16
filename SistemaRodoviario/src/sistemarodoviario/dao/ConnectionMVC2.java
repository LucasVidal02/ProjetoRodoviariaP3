package SistemaRodoviario.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC2 {

    public Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Diver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc?useSSL=false", "gareky1", "henrique12");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
