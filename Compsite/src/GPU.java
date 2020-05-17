class GPU implements GraphComponent {
   String name;

   public GPU(String name) {
      this.name = name;
   }

   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_GPU " + name);
   }
   @Override
   public void process() {
      try {
         int i = 0;
         System.out.print("GPU processing ");
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
