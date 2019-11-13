package mja.designpattern.creational.Builder;

public class PizzaBuilder {
    private BasicIngredient basicIngredient;
    private boolean extraCheese;
    private boolean meat;
    private boolean salami;
    private boolean paperoni;
    private boolean tuna;
    private boolean arugula;
    private boolean onion;
    private boolean pineapple;

    public PizzaBuilder() {
        basicIngredient = new BasicIngredient();
        extraCheese = false;
        meat = false;
        salami = false;
        paperoni = false;
        arugula = false;
        tuna = false;
        onion = false;
        pineapple = false;
    }

    public Pizza bakePizza() {
        return new Pizza(basicIngredient, extraCheese, meat, salami, paperoni, arugula, tuna, onion, pineapple);
    }

    public void addExtraCheese() {
        extraCheese = true;
    }

    public void addMeat() {
        meat = true;
    }

    public void addSalami() {
        salami = true;
    }

    public void addPaperoni() {
        paperoni = true;
    }

    public void addArugula() {
        arugula = true;
    }

    public void addTuna() {
        tuna = true;
    }

    public void addOnion() {
        onion = true;
    }

    public void addPineapple() {
        pineapple = true;
    }
}
