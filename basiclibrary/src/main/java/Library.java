import java.util.Arrays;
import java.util.HashSet;

public class Library {

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

    public static String analyzeWeatherData(int[][] doubleArray){

        String finalAnswer = "";
        int min = doubleArray[0][0];
        int max = doubleArray[0][0];
        HashSet<Integer> uniqueTemperatures = new HashSet<>();

        for (int i = 0; i < doubleArray.length; i++){

            for (int j = 0; j < doubleArray[i].length; j++){
                if(doubleArray[i][j] < min){
                    min = doubleArray[i][j];
                }
                if(doubleArray[i][j] > max){
                    max = doubleArray[i][j];
                }
                uniqueTemperatures.add(doubleArray[i][j]);

            }
        }

        for(int i = min; i < max; i++){
            if(!uniqueTemperatures.contains(i)){
                finalAnswer+=(i + " ");
            }
        }
        return finalAnswer;
    }

    public boolean someLibraryMethod() {
        return true;
    }
}