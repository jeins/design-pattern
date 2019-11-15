package mja.designpattern.creational.Singleton;

public class OrderService {
    private Connection connection;

    public OrderService() {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    public void getOrders() {
        this.connection.runSql("SELECT * FROM order");
    }

    public void getOrderById(int orderId) {
        this.connection.runSql("SELECT * FROM order WHERE order_id=" + orderId);
    }
}
