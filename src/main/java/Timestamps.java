import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int hours3; 
        int minutes3; 
        int seconds3;
        int totalTime;



        /*
         *  your code goes here
         */
        hours3 = hours2 - hours1;
        minutes3 = minutes2 - minutes1;
        seconds3 = seconds2 - seconds1;

      totalTime = (hours3*3600) + (minutes3 *60) + seconds3;
      System.out.print(totalTime);
        // closing the scanner object
        scanner.close();
    }
}
