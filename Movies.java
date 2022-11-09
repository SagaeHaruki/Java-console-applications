import java.util.*;

public class Movies {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Queue<String> movies = new LinkedList<String>();
      Queue<String> snacks = new LinkedList<String>();

      for (int x = 0; x < 3; x++) {
         System.out.print("Enter movie " + (x + 1) + " of 3: ");
         movies.add(scan.nextLine());
      }
      for (int x = 0; x < 3; x++) {
         System.out.print("Enter snacks " + (x + 1) + " of 3: ");
         snacks.add(scan.nextLine());
      }

      System.out.println("Movies to watch are: " + movies);
      System.out.println("Snacks available are: " + snacks);

      do {
         System.out.println("Press S each time you finish a snack");
         scan.nextLine();
         snacks.poll();
         if (snacks.peek() != null) {
            System.out.println(snacks);
         }
      } while (snacks.peek() != null);

      System.out.println("No more snacks!!");
   }
}
