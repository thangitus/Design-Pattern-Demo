class CPU implements ComputerComponent {
   String name;
   int price;

   public CPU(String name, int price) {
      this.name = name;
      this.price = price;
   }

   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_CPU " + name);
   }

   @Override
   public int getPrice() {
      return price;
   }

   @Override
   public int accept(Visitor visitor) {
      return visitor.getMemoryPrice(this);
   }
}
