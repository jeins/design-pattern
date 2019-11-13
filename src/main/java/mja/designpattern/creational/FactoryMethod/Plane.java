package mja.designpattern.creational.FactoryMethod;

public class Plane implements Transport {
    @Override
    public void deliver(String packetName) {
        System.out.println("sending " + packetName + " with plane");
    }
}
