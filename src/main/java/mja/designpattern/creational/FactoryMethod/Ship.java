package mja.designpattern.creational.FactoryMethod;

public class Ship implements Transport {
    @Override
    public void deliver(String packetName) {
        System.out.println("sending " + packetName + " with ship");
    }
}
