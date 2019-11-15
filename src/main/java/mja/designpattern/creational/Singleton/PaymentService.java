package mja.designpattern.creational.Singleton;

public class PaymentService {
    private Connection connection;

    public PaymentService() {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    public void getPaymentById(int paymentId) {
        this.connection.runSql("SELECT * FROM payment WHERE payment_id=" + paymentId);
    }
}
