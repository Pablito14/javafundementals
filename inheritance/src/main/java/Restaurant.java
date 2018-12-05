import java.util.*;
public class Restaurant implements Review{

    /*Instance Variables*/

    private String name;
    private double initialStars;
    private double averageStars;
    private String priceAverage;
    private ArrayList reviews;

    /*Getters*/
    public String getName(){return name;}
    public double getInitialStarsStars(){return initialStars;}
    public double getAverageStarsStars(){return averageStars;}
    public String getPriceAverage(){return priceAverage;}
    public ArrayList<Review> getReviews(){return reviews;}

    /*Constructors*/
    public Restaurant(){}

    /*Initialized Restaurant (no review(s) upon creation)*/
    public Restaurant(String name, double initialStars, String priceAverage) {
        this.name = name;
        this.initialStars = initialStars;
        this.averageStars = initialStars;
        this.priceAverage = priceAverage;
        this.reviews = new ArrayList<Review>();
    }

    /**********************Instance Methods**********************/

    /*Adds a Review object to this Restaurants ArrayList of Reviews*/
    public void addReview(String body, String author, double stars){
        Review newReview = new Review(body, author, stars);
        this.reviews.add(newReview);
        this.averageStars = getAverageOfReviews();
    }

    /*Calculates the average of all reviews*/
    public double getAverageOfReviews(){
        double numberOfReviews = this.reviews.size();
        double average = this.initialStars;
        if(numberOfReviews > 0) {
            for (int i = 0; i < numberOfReviews; i++) {
                average = average + this.reviews.get(i); // break into two statements
            }
            average = average / numberOfReviews;
        }
        return average;
    }

    public String getBody(){}

    @Override
    public String toString(){
        return ("name: " + this.name + ", stars: " + this.initialStars + ", price: " + this.priceAverage);
    }
}

























