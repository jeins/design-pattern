package mja.designpattern.creational.Builder;

public class BasicIngredient {
    private boolean flour;
    private boolean tomatoSauce;
    private boolean cheese;

    public BasicIngredient() {
        flour = true;
        tomatoSauce = true;
        cheese = true;
    }

    public String getIngredient() {
        String ingredient = "";

        if (flour) ingredient += "Flour, ";
        if (tomatoSauce) ingredient += "TomatoSauce, ";
        if (cheese) ingredient += "Cheese, ";

        return ingredient;
    }

    public void showIngredient() {
        System.out.println(getIngredient());
    }
}
