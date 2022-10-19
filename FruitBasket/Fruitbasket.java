import java.util.*;

public class FruitBasket {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in); // Change scan Variable

      Stack<String> Basket = new Stack<String>(); // Basket Variable is Declared

      String a = "Apple";
      String o = "Orange";
      String m = "Mango";
      String g = "Guava";

      System.out.println("Catch and eat any of this Fruits: ('Apple','Orange','Mango','Guava')  ");
      System.out.println("How many fruits to catch? ");
      System.out.print("Enter Here >> ");
      int input = scan.nextInt(); // Change input variable

      for (int i = 1; i <= input; i++) { // Change input same with Line 18
         System.out.println("Fruits left " + i + "/" + input);
         System.out.print("Enter fruit initial >> "); // Fruit initials are A, O, M, G
         String inp1 = scan.next(); // Change inp1 variable

         if (inp1.equals("a") || inp1.equals("A")) { // Change inp1 Same with line 23
            Basket.push(a);
         } else if (inp1.equals("o") || inp1.equals("O")) { // Change inp1 Same with line 23
            Basket.push(o);
         } else if (inp1.equals("m") || inp1.equals("M")) { // Change inp1 Same with line 23
            Basket.push(m);
         } else if (inp1.equals("g") || inp1.equals("G")) { // Change inp1 Same with line 23
            Basket.push(g);
         } else {
            System.out.println("Error"); // Change Error Print
         }
      }

      System.out.println("Your basket have: " + Basket);
      System.out.print("Press E to eat a Fruit: ");

      while (true) {
         char inp2 = scan.next().charAt(0); // Change inp2 variable
         if (inp2 == 'e' || inp2 == 'E') { // Change inp2 variable same with Line 42
            Basket.pop();
         }
         if (Basket.isEmpty()) {
            System.out.println("No more Fruits");
            break;
         }
         System.out.println("Fruit in the basket" + Basket);
         System.out.print("Press E to eat a Fruit: ");
      }
   }
}
