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
}
