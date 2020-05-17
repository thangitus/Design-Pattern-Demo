class Keyboard implements ComputerComponent {
   String name;

   public Keyboard(String name) {
      this.name = name;
   }
   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_Keyboard " + name);
   }
}
