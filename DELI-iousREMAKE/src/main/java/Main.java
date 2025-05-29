import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Welcome to DELI-cous");
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


                }


            }
        }
    }
}
