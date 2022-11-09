import java.util.*;

public class Booklist {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      Stack<String> Booklist = new Stack<String>();
      Queue<String> newBooklist = new LinkedList<String>();
      int input = 4;

      for (int i = 1; i <= input; i++) {
         System.out.print("Book " + i + " : ");
         String input1 = scan.nextLine();
         Booklist.push(input1);
      }
      for (int i = 1; i <= input; i++) {
         newBooklist.offer(Booklist.pop());
      }
      System.out.println("New order of books: ");
      System.out.print(newBooklist);
   }
}
