import java.util.*;
public class Restaurant{

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

    /*******************************Constructors********************************/
    public Restaurant(){}

    /*Initialized Restaurant (no reviews upon creation)*/
    public Restaurant(String name, double initialStars, String priceAverage) {
        this.name = name;
        this.initialStars = initialStars;
        this.averageStars = initialStars;
        this.priceAverage = priceAverage;
        this.reviews = new ArrayList<Review>();
    }

    /***************************Instance Methods*********************************/

    /*Adds a Review object to this Restaurants ArrayList of Reviews*/
    public void addReview(Review review){
        this.reviews.add(review);
        review.restaurant = this;
        averageStars = getAverageOfReviews();
    }

    /*Calculates the average of all reviews*/
    public double getAverageOfReviews(){
        int numberOfReviews = this.reviews.size();
        double average = this.initialStars;
        if(numberOfReviews > 0) {
            for (int i = 0; i < numberOfReviews; i++) {
                Review temp = this.reviews.indexOf(i);
                average = average + temp.getStars(); // break into two statements
            }
            average = average / numberOfReviews;
        }
        return average;
    }

    @Override
    public String toString(){
        return ("name: " + this.name + ", stars: " + this.initialStars + ", price: " + this.priceAverage);
    }
}

























