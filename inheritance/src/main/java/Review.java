public class Review {
    private String body;
    private int stars;
    private String author;
    protected Restaurant restaurant;

    public String getBody() {return body;}

    public int getStars() {return stars;}

    public String getAuthor() {return author;}

    public Review(String body, int stars, String author){
        this.body = body;
        this.stars = stars;
        this.author = author;
        this.restaurant = null;
    }

    @Override
    public String toString(){
        return "Body: " + body + ", Stars: " + stars + ", Author: " + author;
    }

}
