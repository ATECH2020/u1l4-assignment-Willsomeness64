import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int degree = scanner.nextInt();
        int mins;
        int minHand;
        /*
         *  
         */
        minHand = (degree % 30) * 12;
        mins = minHand/6;

        System.out.println(minHand);

        // closing the scanner object
        scanner.close();
    }
}