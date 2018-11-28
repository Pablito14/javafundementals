import java.util.Arrays;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {

    public static void main(String[] args) {

    //First problem
    int[] answerOne = roll(3);
    System.out.println(Arrays.toString(answerOne));

    //Second problem
    int[] parameter = answerOne;
    int answerTwo = averageOfArray(parameter);
    System.out.println("" + answerTwo);

    //Third problem
    boolean answerThree = containsDuplicates(answerOne);
    System.out.println(answerThree);

    //Fourth problem
    int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };

    int[] answerFour = lowestAverage(weeklyMonthTemperatures);
    System.out.println(Arrays.toString(answerFour));

    }

    public static int[] roll(int n){
        int[] rollArray = new int[n];
        for(int i = 0; i < n; i++){        //max = 6 | min =1
            rollArray[i] = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        }
        return rollArray;
    }

    public static int averageOfArray(int[] arrayToCalc){
        int average = 0;
        for (int element : arrayToCalc){
            average += element;
        }
        average = average / arrayToCalc.length;
        return average;
    }

    public static boolean containsDuplicates(int[] arrayToCheck){
        boolean answer = false;
        for(int i = 0; i < arrayToCheck.length; i ++){
            for(int j = i + 1; j < arrayToCheck.length; j ++){
                if(arrayToCheck[i] == arrayToCheck[j]){
                    answer = true;
                }
            }
            }
        return answer;
    }

    public static int[] lowestAverage(int[][] doubleArray){
        int[] finalAnswer = doubleArray[0];
        int lengthOfDA = doubleArray.length;
        int[] averages = new int[lengthOfDA];

        for(int i = 1; i < lengthOfDA; i++){
            averages[i] = averageOfArray(doubleArray[i]);
        }

        for(int i = 1; i < lengthOfDA; i++){
            if(averages[i] < averages[i+1]){
                finalAnswer = doubleArray[i];
            }

        }

        return finalAnswer;
    }

//    public boolean someLibraryMethod() {
//        return true;
//    }
}
