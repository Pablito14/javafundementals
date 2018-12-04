import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testToString() {
        Review yelper = new Review("twas pretty good", "Chancho Rivera", 4.6);
        String stringifiedYelper = yelper.toString();
        assertEquals("body: \"twas pretty good\", author: Chancho Rivera, stars: 4.6", stringifiedYelper);
    }
}