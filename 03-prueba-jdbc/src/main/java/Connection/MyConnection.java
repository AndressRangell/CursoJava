package Connection;

import java.sql.*;

public class MyConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void close(Connection cn, PreparedStatement pst, ResultSet rs) throws SQLException {
        rs.close();
        pst.close();
        cn.close();
    }

    public static void close(Connection cn, PreparedStatement pst) throws SQLException {
        pst.close();
        cn.close();
    }

}
