package mja.designpattern.creational.FactoryMethod;

import java.util.Optional;

public class PacketDelivery {
    public enum Transporter { PLANE, SHIP, TRUCK }

    private Transport transport;

    public void setTransporter(String transporter) {
        if (transporter.equals(Transporter.PLANE.toString())) {
            transport = new Plane();
        } else if (transporter.equals(Transporter.SHIP.toString())) {
            transport = new Ship();
        } else if (transporter.equals(Transporter.TRUCK.toString())) {
            transport = new Truck();
        }
    }

    public void deliver(String packetName) {
        if(Optional.ofNullable(transport).isPresent()) {
            transport.deliver(packetName);
        } else {
            System.err.println("transporter not yet set!");
        }
    }
}
