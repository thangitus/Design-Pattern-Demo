class CPU implements ComputerComponent {
   String name;

   public CPU(String name) {
      this.name = name;
   }

   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_CPU " + name);
   }
}
