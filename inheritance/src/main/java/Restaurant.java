import java.util.ArrayList;
//Restaurant is the super class so Review gets Restaurant
public class Restaurant /*extends Review */{

    private String name;
    private double stars;
    private int priceAverage;
    private ArrayList reviews;

    /*Empty Restaurant Object*/
    public Restaurant(){

    }

    /*Semi Initialized Restaurant (no review(s) upon creation)*/
    public Restaurant(String name, double stars, int priceAverage) {
        this.name = name;
        this.stars = stars;
        this.priceAverage = priceAverage;
        this.reviews = new ArrayList<Review>();
    }

    /*Fully Initialized Restaurant (with review(s) upon creation)*/
    public Restaurant(String name, double stars, int priceAverage, Review reviewOnThisLocation) {
        this.name = name;
        this.stars = stars;
        this.priceAverage = priceAverage;
        this.reviews = new ArrayList<Review>();
        reviews.add(reviewOnThisLocation);
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return ("name: " + this.name + ", stars: " + this.stars + ", price: " + this.priceAverage);
    }
}

























