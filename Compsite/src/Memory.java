class Memory implements GraphComponent, ComputerComponent {
   String name;

   public Memory(String name) {
      this.name = name;
   }

   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_Memory " + name);
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
