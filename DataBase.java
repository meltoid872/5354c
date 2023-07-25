package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    private Connection connection;

    public Connection getConnection() throws SQLException {

        if (connection == null) {
            return connection;


        }
        String url = "jdbc:mysql://localhost/start_tracker";
        String user = "root";
        String password = "";

        this.connection = DriverManager.getConnection(url, user , password);

        System.out.println("Connetted to the database");

        return this.connection;
    }

    public void initializeDatabase() throws SQLException {
        try {
            Statement statement = getConnection().createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS player_stats(uuid varchar(36) primary key last_login DATE last_logout DATE)";
            statement.execute(sql);

            statement.close();
            System.out.println("created the stats table");
        } catch (SQLException e) {
            System.out.printf("unable to connect to the database");

            e.printStackTrace();
        }
    }
}
