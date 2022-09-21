import java.util.Scanner;

public class GuessingGame {

   public static void main(String[] args) {

      int enter = 0;

      int guess = 0;

      while (enter == 0) {

         enter = (int) (Math.random() * 51);
      }

      try (Scanner input = new Scanner(System.in)) {
         while (guess != enter) {

            System.out.print("Guess a number from 1 to 50: ");

            String userinput = input.nextLine();

            try {
               guess = Integer.parseInt(userinput);

            } catch (NumberFormatException e) {

            }
            boolean max = ((guess < 51) && (guess > 0));

            if ((guess == enter) && max) {

               System.out.println("Your guess is correct");
            }

            else if ((guess > enter) && max) {

               System.out.println("Too high, try again");
            }

            else if ((guess < enter) && max) {

               System.out.println("Too low, try again");

            } else if (enter < 51) {

               System.out.println("Out of range");

            } else if (enter != guess) {

               System.out.println("Invalid Input");

            } else {

               System.out.println("Invalit Input");

            }
         }
      }
   }
}