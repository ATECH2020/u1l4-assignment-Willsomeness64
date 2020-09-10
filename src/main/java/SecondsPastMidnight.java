import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        System.out.println("Enter a time for the SecondsPastMidnight");
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
       
        int number = scanner.nextInt();
        int hours;
        int mins;
        //Your code goes here

       hours = number / 3600;
       mins =  number / 60;
       System.out.println(hours + " " + mins);
        //Your code goes here


        // closing the scanner object
        scanner.close();
    }
}