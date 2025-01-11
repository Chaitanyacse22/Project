import java.sql.*;

public class DatabaseUtil {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/health_logger";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Other methods for executing queries, handling result sets, etc.
}
