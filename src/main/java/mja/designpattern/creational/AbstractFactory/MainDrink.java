package mja.designpattern.creational.AbstractFactory;

public class MainDrink implements Drink {
    @Override
    public void serve() {
        System.out.println("serving main drink with water");
    }
}
