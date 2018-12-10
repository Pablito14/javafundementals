import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams(){
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

        @Test
        public void testRol() {
                int[] tester = Library.roll(2);
                assertFalse(tester[0] == tester[1]);
        }

        @Test
        public void testAverageOfArray() {
            int[] test = {1,2,3,4,5,6,7,8,9,10};
            int average = Library.averageOfArray(test);
            assertTrue("This should test if the average of 1-10 is correct.",5 == average );
        }

//        @Test
//        public void testContainsDuplicates() {
//        }
//
//        @Test
//        public void testLowestAverage() {
//        }

        @Test
        public void testAnalyzeWeatherData() {
            Library.analyzeWeatherData();
            assertEquals("High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n", outContent.toString());
        }

        @Test
        public void testTallies(){
            List<String> votes = new ArrayList<>();
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Shrub");
            votes.add("Hedge");
            votes.add("Shrub");
            votes.add("Bush");
            votes.add("Hedge");
            votes.add("Bush");

            assertEquals("Bush received the most votes!", Library.tally(votes));

        }

        @Test
        public void testSomeLibraryMethod() {
            Library classUnderTest = new Library();
            assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        }






}