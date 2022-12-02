import java.util.*;
import java.util.stream.Collectors;

public class MyClass {
   public static void main(String[] args) {
      Scanner Scan = new Scanner(System.in);

      Map<String, String> Group1 = new HashMap<>();
      Map<String, String> Group2 = new HashMap<>();

      HashSet<String> Groupe1 = new LinkedHashSet<String>();
      HashSet<String> Groupe2 = new LinkedHashSet<String>();
      HashSet<String> Self = new LinkedHashSet<String>();
      HashSet<String> Name1 = new LinkedHashSet<String>();
      HashSet<String> Name2 = new LinkedHashSet<String>();

      for (int x = 1; x < 3; x++) {
         System.out.print("---------------------------------------------------\n");
         System.out.print("Group 1\n");
         System.out.print("Enter a Name: ");
         String NM1 = Scan.nextLine();
         Name1.add(NM1);
         System.out.print("Enter " + NM1 + "\'s Birth Month: ");
         String BM1 = Scan.nextLine();
         Groupe1.add(BM1);
         Group1.put(NM1, BM1);

         System.out.print("---------------------------------------------------\n");
         System.out.print("Group 2\n");
         System.out.print("Enter a Name: ");
         String NM2 = Scan.nextLine();
         Name2.add(NM2);
         System.out.print("Enter " + NM2 + "\'s Birth Month: ");
         String BM2 = Scan.nextLine();
         Groupe2.add(BM2);
         Group2.put(NM2, BM2);
      }

      HashSet<String> union = new HashSet<String>(Groupe1);
      HashSet<String> intersection = new HashSet<String>(Groupe1);
      HashSet<String> difference = new HashSet<String>(Groupe1);

      union.addAll(Groupe2);
      intersection.retainAll(Groupe2);
      difference.removeAll(Groupe2);

      System.out.print("---------------------------------------------------\n");
      System.out.print("Arrangement of Group 1: \n");

      List<String> Gp1 = new ArrayList<String>(Group1.keySet());
      Collections.reverse(Gp1);
      for (String strKey : Gp1) {
         System.out.print("Name: " + strKey + " || Birth Month: " + Group1.get(strKey) + "\n");
      }

      System.out.print("---------------------------------------------------\n");
      System.out.print("Arrangement of Group 2: \n");

      List<String> Gp2 = new ArrayList<String>(Group2.keySet());
      Collections.reverse(Gp2);
      for (String strKey2 : Gp2) {
         System.out.print("Name: " + strKey2 + " || Birth Month: " + Group2.get(strKey2) + "\n");
      }

      System.out.print("---------------------------------------------------\n");

      System.out.print("Enter your birth Month: ");
      String myBM = Scan.nextLine();
      Self.add(myBM);
      System.out.print("---------------------------------------------------\n");

      System.out.print("Union: " + union + "\n");
      System.out.print("Intersection: " + intersection + "\n");
      System.out.print("Difference: " + difference + "\n");
      System.out.print("---------------------------------------------------\n");

      Group1.putAll(Group2);

      if (Groupe1.containsAll(Self) || Groupe2.containsAll(Self)) {
         System.out.print("Your Classmate(s) with Birth month of " + myBM + " the same as you! \n");

         Group1.keySet().removeAll(
               Group1.entrySet().stream()
                     .filter(a -> !a.getValue().equals(myBM))
                     .map(e -> e.getKey()).collect(Collectors.toList()));

         List<String> Gp3 = new ArrayList<String>(Group1.keySet());
         Collections.reverse(Gp3);
         for (String strKey3 : Gp3) {
            System.out.print("Name: " + strKey3 + "\n");
         }

         System.out.print("---------------------------------------------------\n");

      } else {
         System.out.print("You don't have the same birth month with any of your Classmate.");
         System.out.print("---------------------------------------------------\n");
      }
   }
}
