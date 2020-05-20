class Monitor implements ComputerComponent {
   String name;
   int price;

   public Monitor(String name, int price) {
      this.name = name;
      this.price = price;
   }

   @Override
   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_Monitor " + name);
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
