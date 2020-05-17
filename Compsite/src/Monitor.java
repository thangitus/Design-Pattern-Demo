class Monitor implements ComputerComponent {
   String name;

   public Monitor(String name) {
      this.name = name;
   }
   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_Monitor " + name);
   }
}
