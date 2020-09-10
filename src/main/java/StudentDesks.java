import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int desksNeeded = 0;

        /*
         *  your code goes here
         */

          if (a%2 != 1)
          {
            desksNeeded += a/2;
          } 
          else 
         {
          desksNeeded += a/2 + 1;       
         }

          if (b%2 != 1)
          {
          desksNeeded += b/2;
          }
          else 
          {
          desksNeeded += b/2 + 1;
          }

         if (c%2 != 1)
          {
          desksNeeded += c/2;
          }
         else 
         {
          desksNeeded += c/2 + 1;
         }
        System.out.println(desksNeeded);


        scanner.close();
        }


        
        // closing the scanner object
        
    }
