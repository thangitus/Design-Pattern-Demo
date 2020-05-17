class Demo {
   public static void main(String[] args) {
      Memory m1 = new Memory("Kingston", 12);
      Memory m2 = new Memory("Samsung", 54);

      GPU gpu1 = new GPU("VGA", 26);
      GPU gpu2 = new GPU("NVIDIA", 9);

      Keyboard keyboard1 = new Keyboard("Logitech K380", 4);
      Keyboard keyboard2 = new Keyboard("Keychron K2", 6);

      Monitor monitor = new Monitor("Phillips", 7);

      CPU cpu = new CPU("Intel Core i9-9900K", 100);

      GraphCard graphCard1 = new GraphCard("Quadro RTX 8000");
      graphCard1.addComponent(m1);
      graphCard1.addComponent(gpu1);

      GraphCard graphCard2 = new GraphCard("NNIDIA titan rtx");
      graphCard2.addComponent(gpu2);
      graphCard2.addComponent(m2);

      Computer computer = new Computer("My Computer");
      computer.addComponent(graphCard1);
      computer.addComponent(keyboard1);
      computer.addComponent(keyboard2);
      computer.addComponent(monitor);
      computer.addComponent(cpu);
      computer.addComponent(m2);
      computer.addComponent(graphCard2);

      computer.display(" ");

      System.out.println();
      System.out.println("Price of this computer: " + computer.getPrice());
   }
}
