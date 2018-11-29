/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testForDuplicates(){
        int[] arrayToCheckF = {0, 1, 2};
        int[] arrayToCheckT = {1, 1, 1};
        assertFalse("Testing duplicate method for duplicates", Library.containsDuplicates(arrayToCheckF));
        assertTrue("Testing duplicate method for duplicates", Library.containsDuplicates(arrayToCheckT));
    }

    @Test public void testAnalyzeWeatherData(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assert
    }

}
