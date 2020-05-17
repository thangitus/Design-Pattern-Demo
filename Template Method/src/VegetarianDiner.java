class VegetarianDiner extends DinerServe {

   @Override
   protected void serveMainCourse() {
      System.out.println("serve vegetarian main course");
   }

   @Override
   protected void serveAppetizer() {
      System.out.println("serve vegetarian appetizer");
   }

   @Override
   protected void serveDessert() {
      System.out.println("serve vegetarian dessert");
      try {
         int i = 0;
         System.out.print("Wait");
         while (i < 5) {
            System.out.print(".");
            Thread.sleep(500);
            i++;
         }
      } catch (InterruptedException ex) {
         ex.printStackTrace();
      }
      System.out.println();
   }

}
