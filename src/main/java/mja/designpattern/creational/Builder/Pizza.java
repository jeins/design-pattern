package mja.designpattern.creational.Builder;

public class Pizza {
    private BasicIngredient basicIngredient;
    private boolean extraCheese;
    private boolean meat;
    private boolean salami;
    private boolean tuna;
    private boolean paperoni;
    private boolean arugula;
    private boolean onion;
    private boolean pineapple;

    public Pizza(
            BasicIngredient basicIngredient,
            boolean extraCheese,
            boolean meat,
            boolean salami,
            boolean paperoni,
            boolean arugula,
            boolean tuna,
            boolean onion,
            boolean pineapple) {
        this.basicIngredient = basicIngredient;
        this.extraCheese = extraCheese;
        this.meat = meat;
        this.salami = salami;
        this.paperoni = paperoni;
        this.arugula = arugula;
        this.tuna = tuna;
        this.onion = onion;
        this.pineapple = pineapple;
    }

    public void printIngredient() {
        String ingredient = basicIngredient.getIngredient();

        if (extraCheese) ingredient += "Extra Cheese, ";
        if (meat) ingredient += "Meat, ";
        if (salami) ingredient += "Salami, ";
        if (paperoni) ingredient += "Paperoni, ";
        if (salami) ingredient += "Salami, ";
        if (arugula) ingredient += "Arugula, ";
        if (tuna) ingredient += "Tuna, ";
        if (onion) ingredient += "Onion, ";
        if (pineapple) ingredient += "Pineapple, ";

        System.out.println(ingredient);
    }
}
