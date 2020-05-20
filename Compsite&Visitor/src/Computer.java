import java.util.ArrayList;
import java.util.List;

class Computer {
   String name;
   List<ComputerComponent> computerComponents;

   public Computer(String name) {
      this.name = name;
      computerComponents = new ArrayList<>();
   }

   void addComponent(ComputerComponent computerComponent) {
      if (!computerComponents.contains(computerComponent))
         computerComponents.add(computerComponent);
   }

   public void display(String indent) {
      indent += indent;
      System.out.println(indent + name);
      for (ComputerComponent component : computerComponents)
         component.display(indent);
   }

   public int getPrice() {
      int sum = 0;
      for (ComputerComponent computerComponent : computerComponents)
         sum += computerComponent.getPrice();

      return sum;
   }

   public int getTotalMemoryPrice(Visitor visitor) {
      int sum = 0;
      for (ComputerComponent computerComponent : computerComponents)
         sum += computerComponent.accept(visitor);
      return sum;
   }

}
