package mja.designpattern.creational.AbstractFactory;

public class AppetizerFood implements Food {
    @Override
    public void serve() {
        System.out.println("serving appetizer food fish soup.");
    }
}
