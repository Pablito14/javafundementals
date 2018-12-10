import java.util.*;

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

    public static void analyzeWeatherData(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int low = weeklyMonthTemperatures[0][0];
        int high = weeklyMonthTemperatures[0][0];
        HashSet<Integer> uniqueTemperatures = new HashSet<>();

        for (int i = 0; i < weeklyMonthTemperatures.length; i++){
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++){
                if(weeklyMonthTemperatures[i][j] < low){
                    low = weeklyMonthTemperatures[i][j];
                }
                if(weeklyMonthTemperatures[i][j] > high){
                    high = weeklyMonthTemperatures[i][j];
                }
                uniqueTemperatures.add(weeklyMonthTemperatures[i][j]);
            }
        }

        System.out.println("High: " + high);
        System.out.println("Low: " + low);

        for(int i = low + 1; i < high; i++){
            if(!uniqueTemperatures.contains(i)){
                System.out.println("Never saw temperature: " + i);
            }
        }
    }

    public static String tally(List<String> votes){
        HashMap<String, Integer> tallies = new HashMap<>();
        for(String vote : votes){
            if(tallies.containsKey(vote)){
                tallies.put(vote, tallies.get(vote) + 1);
            } else {
                tallies.put(vote, 1);
            }
        }
        int highestVotes = 0;
        String winner = "";
        for(String key : tallies.keySet()){
            if(tallies.get(key) > highestVotes){
                highestVotes = tallies.get(key);
                winner = key;
            }
        }
        return winner + " received the most votes!";
    }

    public boolean someLibraryMethod() {
        return true;
    }
}