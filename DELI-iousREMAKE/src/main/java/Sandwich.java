import java.util.ArrayList;

public class Sandwich {

    private String size;
    private String breadType;
    private boolean isToasted;


    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private ArrayList<String> toppings;
    private ArrayList<String> sauces;


    public Sandwich(String size, String breadType, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;

        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
    }

    public void addMeat(String meat) {
        meats.add(meat);
    }

    public void addCheese(String cheese) {
        cheeses.add(cheese);
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    public double calculatePrice() {
        double price = 0.0;

        if (size.equals("4")) {
            price = 5.50;
        } else if (size.equals("8")) {
            price = 7.00;
        } else if (size.equals("12")) {
            price = 8.50;
        }

        price += meats.size() * getMeatPrice();
        price += cheeses.size() * getCheesePrice();

        return price;
    }

    private double getMeatPrice() {
        switch (size) {
            case "4": return 1.00;
            case "8": return 2.00;
            case "12": return 3.00;
            default: return 0;

        }
    }

    private double getCheesePrice() {
        switch (size) {
            case "4": return 0.75;
            case "8": return 1.50;
            case "12": return 2.25;
            default: return 0;

        }
    }

    public String toString() {
        return
    }
}
