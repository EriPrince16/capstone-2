import java.util.ArrayList;

public class Order {

    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Drink> drinks;
    private ArrayList<Chips> chips;


    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);

    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double getTotalPrice() {
        double total = 0.0;

        // Add prices of all sandwiches
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.calculatePrice();
        }

        // Add prices of all drinks
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }

        // Add prices of all chips
        for (Chips chip : chips) {
            total += chip.getPrice();
        }

        return total;
    }
}
