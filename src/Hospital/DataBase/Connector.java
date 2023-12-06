package Hospital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private Connection connection;
    public Connector()
    {
        try {
            Class.forName("org.postgresql.Driver"); //Driver
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hospital","postgres", "superuser");
        } catch (SQLException | ClassNotFoundException e) {throw new RuntimeException("Error while connection: " + e.getMessage());}
    }
    public Connection getConnection() {return connection;}
}
