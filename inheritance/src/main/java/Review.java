public class Review {

    private String body;
    private String author;
    private double stars;
    private String location;

    public Review(String body, String author, double stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(String body, String author, double stars, String location){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.location = location;
    }



    public String toString(){
        return ("body: \"" + this.body + "\", author: " + this.author + ", stars: " + this.stars);
    }

}
