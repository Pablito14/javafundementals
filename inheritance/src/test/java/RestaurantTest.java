import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant Chanchos = new Restaurant("Chanchos", 4.6, "$");
        String stringifiedChanchos = Chanchos.toString();
        assertEquals("name: Chanchos, stars: 4.6, price: $", stringifiedChanchos);
    }

    @Test
    public void testGetName() {
        Restaurant Chanchos = new Restaurant("Chanchos", 4.6, "$");
        String nameOfRestaurant = Chanchos.getName();
        assertEquals("This tests to see if this restaurant name getter mthod returns the proper name","Chanchos", nameOfRestaurant);
    }

    @Test
    public void testAddReview() {
    }


    @Test
    public void addReview() {
    }

    @Test
    public void getAverageOfReviews() {
        Restaurant Chanchos = new Restaurant("Chanchos", 0.0, "$");
        double chanchosRating = Chanchos.getAverageOfReviews();
        assertEquals("Checks to see if initial rating is the expected output(0)", 0.0, chanchosRating, 1e-8);

       Chanchos.addReview("good", "Paul Blart", 4.4);
        chanchosRating = Chanchos.getAverageOfReviews();
        assertEquals("Checks to see if adding a review updates the current rating(Only one review)", 4.4, chanchosRating, 1e-8);

        Chanchos.addReview("gooder", "Com Truise", 4.6);
        Chanchos.addReview("goody", "ANON", 4.5);
        chanchosRating = Chanchos.getAverageOfReviews();
        assertEquals("Checks to see if adding a review updates the current rating(multiple reviews)", 4.5, chanchosRating, 1e-8);
    }


}