package mja.designpattern.creational.AbstractFactory;

public class Restaurant {
    private CourseFactory courseFactory;

    public Restaurant(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    public void serve() {
        this.courseFactory.serveFood();
        this.courseFactory.serveDrink();
    }
}
