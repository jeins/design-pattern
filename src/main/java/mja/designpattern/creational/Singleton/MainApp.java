package mja.designpattern.creational.Singleton;

/**
 * Singleton
 * Ensure a class only has one instance, and provide a global point of access to it.
 */
public class MainApp {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.getOrderById(10);
        orderService.getOrders();

        PaymentService paymentService = new PaymentService();
        paymentService.getPaymentById(1);
    }
}
