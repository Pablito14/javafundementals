import java.util.*;
public class Restaurant{

    /*Instance Variables*/

    private String name;
    private double stars;
    private String priceAverage;
    private ArrayList reviews;

    /*Getters*/
    public String getName(){return name;}
    public double getStars(){return stars;}
    public String getPriceAverage(){return priceAverage;}
    public ArrayList<Review> getReviews(){return reviews;}

    /*Constructors*/
    public Restaurant(){}

    /*Initialized Restaurant (no review(s) upon creation)*/
    public Restaurant(String name, double stars, String priceAverage) {
        this.name = name;
        this.stars = stars;
        this.priceAverage = priceAverage;
        this.reviews = new ArrayList<Review>();
    }

    /**********************Instance Methods**********************/

    /*Adds a Review object to this Restaurants ArrayList of Reviews*/
    public void addReview(String body, String author, double stars){
        Review newReview = new Review(body, author, stars);
        this.reviews.add(newReview);
        this.stars = getAverageOfReviews();
    }

    /*Calculates the average of all reviews*/
    public double getAverageOfReviews(){
        int numberOfReviews = this.reviews.size();
        double average = this.stars;
        if(numberOfReviews > 0) {
            for (int i = 0; i < numberOfReviews; i++) {
                average += this.stars;
            }
            average = average / numberOfReviews;
        }
        return average;
    }

    @Override
    public String toString(){
        return ("name: " + this.name + ", stars: " + this.stars + ", price: " + this.priceAverage);
    }
}

























