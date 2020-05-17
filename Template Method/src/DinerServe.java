import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class DinerServe {
   boolean isServeDrink;

   public final void serve() {
      beforeStart();
      orderDrinks();
      if (isServeDrink)
         makeDrinks();
      serveAppetizer();
      serveMainCourse();
      serveDessert();
      afterEnd();
   }
   protected void afterEnd() {
      System.out.println("After end!");
   }
   protected abstract void serveDessert();

   protected abstract void serveMainCourse();

   protected abstract void serveAppetizer();
   protected void orderDrinks() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Serve drinks?");
      System.out.println("1. Yes");
      System.out.println("2. No");
      System.out.print("Option: ");
      int choice = 0;
      try {
         choice = scanner.nextInt();
      } catch (InputMismatchException e) {
         e.printStackTrace();
      }
      isServeDrink = choice == 1;
   }
   protected void makeDrinks() {
      System.out.println("Make drinks");
      System.out.println("Serve drinks");
   }
   protected void beforeStart() {
      System.out.println("Before start");
   }
}
