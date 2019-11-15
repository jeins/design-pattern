package mja.designpattern.creational.Singleton;

public class DatabaseConnection {
    public static DatabaseConnection databaseConnection;
    private Connection connection;

    private DatabaseConnection() {
        connection = new Connection("localhost", "root", "password");
    }

    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }

        return databaseConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
