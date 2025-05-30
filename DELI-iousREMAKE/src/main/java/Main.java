import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Welcome to DELI-cious");
            System.out.println("1) Create an order");
            System.out.println("0) Exit the store");
            System.out.print("Select your option: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                Order order = new Order();
                boolean currentOrder = true;

                while (currentOrder) {
                    System.out.println("--- Order Menu ---");
                    System.out.println("1) Build a Sandwich");
                    System.out.println("2) Add Drink");
                    System.out.println("3) Add Chips");
                    System.out.println("4) Checkout");
                    System.out.println("0) Cancel your Order");
                    System.out.print("Select your option: ");
                    String orderChoice = scanner.nextLine();

                    switch (orderChoice) {
                        case "1":
                            Sandwich sandwich = createSandwich();
                            order.addSandwich(sandwich);
                            System.out.println("Sandwich added!");
                            break;
                        case "2":
                            Drink drink = createDrink();
                            order.addDrink(drink);
                            System.out.println("Drink added!");
                            break;
                        case "3":
                            Chips chips = createChips();
                            order.addChips(chips);
                            System.out.println("Chips added!");
                            break;
                        case "4":
                            System.out.println("\nFinal Order:\n");
                            System.out.println(order.toString());
                            currentOrder = false; // return to home screen
                            break;
                        case "0":
                            System.out.println("Order canceled.");
                            currentOrder = false; // return to home screen
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }

            } else if (userInput.equals("0")) {
                System.out.println("Thank you for visiting DELI-cious!");
                keepGoing = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Build a sandwich by asking the user questions
    public static Sandwich createSandwich() {
        System.out.print("Choose bread (white, wheat, rye, wrap): ");
        String bread = scanner.nextLine();

        System.out.print("Choose size (4, 8, 12): ");
        String size = scanner.nextLine();

        System.out.print("Do you want it toasted? (yes or no): ");
        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, bread, toasted);

        System.out.println("Add meats (type 'done' to stop): ");
        while (true) {
            System.out.print("Meat: ");
            String meat = scanner.nextLine();
            if (meat.equalsIgnoreCase("done")) break;
            sandwich.addMeat(meat);
        }

        System.out.println("Add cheeses (type 'done' to stop): ");
        while (true) {
            System.out.print("Cheese: ");
            String cheese = scanner.nextLine();
            if (cheese.equalsIgnoreCase("done")) break;
            sandwich.addCheese(cheese);
        }

        System.out.println("Add toppings (type 'done' to stop): ");
        while (true) {
            System.out.print("Topping: ");
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase("done")) break;
            sandwich.addTopping(topping);
        }

        System.out.println("Add sauces (type 'done' to stop): ");
        while (true) {
            System.out.print("Sauce: ");
            String sauce = scanner.nextLine();
            if (sauce.equalsIgnoreCase("done")) break;
            sandwich.addSauce(sauce);
        }

        return sandwich;
    }

    // Build a drink
    public static Drink createDrink() {
        System.out.print("Choose drink size (small, medium, large): ");
        String size = scanner.nextLine();

        System.out.print("Choose drink flavor: ");
        String flavor = scanner.nextLine();

        return new Drink(size, flavor);
    }

    // Build chips
    public static Chips createChips() {
        System.out.print("Choose chips type (BBQ, sour cream, etc.): ");
        String type = scanner.nextLine();

        return new Chips(type);
    }
}
