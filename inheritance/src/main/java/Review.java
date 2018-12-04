public class Review extends Restaurant{

    /*Instance Variables*/
    private String body;
    private String author;
    private double stars;
    private String reviewedLocation;

    /*Empty Review Object */
    public Review(){

    }

    /*Semi Initialized Review Object (no Location )*/
//    public Review(String body, String author, double stars){
//        this.body = body;
//        this.author = author;
//        this.stars = stars;
//        this.reviewedLocation = null;
//    }

    /*Fully Instantiated Review Object*/
    public Review(String body, String author, double stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.reviewedLocation = super.getName();
    }

    public String toString(){
        if(this.reviewedLocation != null) {
            return ("body: \"" + this.body + "\", author: " + this.author + ", stars: " + this.stars + ", reviewedLocation: " + reviewedLocation);
        } else {
            return ("body: \"" + this.body + "\", author: " + this.author + ", stars: " + this.stars);
        }
    }

}
