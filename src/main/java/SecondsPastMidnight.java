import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
       
        int number = scanner.nextInt();
        int hours;
        int mins;
        //Your code goes here

       hours = number / 3600;
       mins =  number / 60;
        //Your code goes here


        // closing the scanner object
        scanner.close();
    }
}