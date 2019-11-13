package mja.designpattern.creational.AbstractFactory;

public class AppetizerDrink implements Drink {
    @Override
    public void serve() {
        System.out.println("serving appetizer drink with green tea");
    }
}
