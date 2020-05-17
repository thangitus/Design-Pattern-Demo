import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
   public static void main(String[] args) {
      DinerServe dinerServe;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Which customer is serve?");
      System.out.println("1. Vegetarian Diner");
      System.out.println("2. Normal Diner");
      System.out.print("Option: ");
      int choice = 0;
      try {
         choice = scanner.nextInt();
      } catch (InputMismatchException e) {
         e.printStackTrace();
      }
      if (choice == 1)
         dinerServe = new VegetarianDiner();
      else
         dinerServe = new NormalDiner();

      dinerServe.serve();
   }
}
