import java.util.*;

public class Review {

    /*Instance Variables*/
    private String body;
    private String author;
    private double stars;

    /*Getters*/
    public String getBody(){return body;}
    public String getAuthor(){return author;}
    public double getStars(){return stars;}

    /*Constructors*/
    public Review(){}

    public Review(String body, String author, double stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    /*Instance Methods*/
    @Override
    public String toString(){
        return ("body: \"" + this.body + "\", author: " + this.author + ", stars: " + this.stars);
    }
}


