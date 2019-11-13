package mja.designpattern.creational.AbstractFactory;

public class MainFood implements Food {
    @Override
    public void serve() {
        System.out.println("serving main food with nasi goreng");
    }
}
