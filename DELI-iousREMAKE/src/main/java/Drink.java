public class Drink {

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice() {
        switch (size.toLowerCase()) {
            case "small":
                return 2.00;
            case "medium":
                return 2.50;
            case "large":
                return 3.00;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    public String toString() {return size + " " + flavor + " - $" + String.format("%.2f", getPrice());}
}
