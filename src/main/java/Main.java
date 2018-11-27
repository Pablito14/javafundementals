import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
//        String myString = "Pablo";
//        String answer = pluralize(myString, 0);
//        System.out.println(answer);
//        flipNHeads(4);
        clock();
    }

    //Defining my funky functions//
    public static String pluralize(String input, int num) {
        if (num == 0 || num < 1) {
            input = input + "s";
        }
        return input;
    }

    public static void flipNHeads(int n) {
        int headCount = 0;
        int flips;
        for (flips = 0; headCount < n; flips++) {
            double resultOfFlip = Math.random();
            if (resultOfFlip < 0.5) {
                System.out.println("tails");
            } else {
                System.out.println("heads");
                headCount++;
            }
        }
        System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    }

    public static void clock (){
        boolean on = true;
        while(on == true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            int temp = second;
            if(second != temp) {
                System.out.println(hour + ":" + minute + ":" + second);
            }
        }

    }

}





















