package mja.designpattern.creational.AbstractFactory;

public class AppetizerCourse implements CourseFactory {
    private Food food;
    private Drink drink;

    public AppetizerCourse() {
        food = new AppetizerFood();
        drink = new AppetizerDrink();
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
