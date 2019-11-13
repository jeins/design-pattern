package mja.designpattern.creational.AbstractFactory;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---- restaurant serving appetizer ----");
        Restaurant restaurantAppetizer = new Restaurant(new AppetizerCourse());
        restaurantAppetizer.serve();

        System.out.println("\n");
        System.out.println("---- restaurant serving main course ----");
        Restaurant restaurantMainCourse = new Restaurant(new MainCourse());
        restaurantMainCourse.serve();
    }
}
