import java.util.ArrayList;

public class Restaurant extends Review {

    private String name;
    private double stars;
    private int priceAverage;
    private ArrayList reviews;

    public Restaurant(String name, double stars, int priceAverage) {
        this.name = name;
        this.stars = stars;
        this.priceAverage = priceAverage;
        this.reviews = new ArrayList<>();
    }


    public String toString(){
        return ("name: " + this.name + ", stars: " + this.stars + ", price: " + this.priceAverage);
    }
}

























