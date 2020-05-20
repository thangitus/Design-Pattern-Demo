 class Visitor {
   public int getMemoryPrice(CPU cpu) {return 0;}
   public int getMemoryPrice(GPU gpu) {return 0;}
   public int getMemoryPrice(Monitor monitor) {return 0;}
   public int getMemoryPrice(Keyboard keyboard) {return 0;}
   public int getMemoryPrice(Memory memory) {return memory.price;}
}
