class Memory implements GraphComponent, ComputerComponent {
   String name;
   int price;

   public Memory(String name, int price) {
      this.name = name;
      this.price = price;
   }

   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_Memory " + name);
   }

   @Override
   public int getPrice() {
      return price;
   }

   @Override
   public void process() {
      try {
         int i = 0;
         System.out.print("Memory processing ");
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
