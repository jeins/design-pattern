package mja.designpattern.creational.Builder;

/**
 * Builder:
 * Separate the construction of a complex object from its representation so that
 * the same construction process can create different representations.
 */
public class MainApp {
    public static Pizza pizzaHawaiiBuilder() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.addExtraCheese();
        pizzaBuilder.addPineapple();
        pizzaBuilder.addSalami();

        return pizzaBuilder.bakePizza();
    }

    public static Pizza pizzaTonnoBuilder() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.addOnion();
        pizzaBuilder.addTuna();

        return pizzaBuilder.bakePizza();
    }

    public static Pizza specialMeatBuilder() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.addExtraCheese();
        pizzaBuilder.addSalami();
        pizzaBuilder.addMeat();
        pizzaBuilder.addPaperoni();

        return pizzaBuilder.bakePizza();
    }

    public static void main(String[] args) {
        Pizza pizzaHawaii = MainApp.pizzaHawaiiBuilder();
        Pizza pizzaTonno = MainApp.pizzaTonnoBuilder();
        Pizza pizzaSpecialMeat = MainApp.specialMeatBuilder();

        System.out.println("--- ingredient hawaii pizza ---");
        pizzaHawaii.printIngredient();

        System.out.println("\n");
        System.out.println("--- ingredient tonno pizza ---");
        pizzaTonno.printIngredient();

        System.out.println("\n");
        System.out.println("--- ingredient special meat pizza ---");
        pizzaSpecialMeat.printIngredient();
    }
}
