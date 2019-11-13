package mja.designpattern.creational.AbstractFactory;

public class MainCourse implements CourseFactory {
    private Food food;
    private Drink drink;

    public MainCourse() {
        food = new MainFood();
        drink = new MainDrink();
    }

    @Override
    public void serveFood() {
        food.serve();
    }

    @Override
    public void serveDrink() {
        drink.serve();
    }
}
