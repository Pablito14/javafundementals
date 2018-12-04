import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant Chanchos = new Restaurant("Chanchos", 4.6, 14);
        String stringifiedChanchos = Chanchos.toString();
        assertEquals("name: Chanchos, stars: 4.6, price: 14", stringifiedChanchos);
    }
}