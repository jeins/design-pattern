package mja.designpattern.creational.FactoryMethod;

/**
 * Factory Method
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 */
public class MainApp {
    public static void main(String[] args) {
        String transporter = PacketDelivery.Transporter.SHIP.toString();
        String packetName = "Books";

        PacketDelivery packetDelivery = new PacketDelivery();
        packetDelivery.setTransporter(transporter);
        packetDelivery.deliver(packetName);
    }
}
