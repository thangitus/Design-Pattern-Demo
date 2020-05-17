import java.util.ArrayList;
import java.util.List;

class GraphCard implements ComputerComponent {
   String name;
   List<GraphComponent> graphCardsComponents;

   public GraphCard(String name) {
      this.name = name;
      graphCardsComponents = new ArrayList<>();
   }

   void addComponent(GraphComponent component) {
      if (!graphCardsComponents.contains(component))
         graphCardsComponents.add(component);
   }

   public void display(String indent) {
      indent += indent;
      System.out.println(indent + "|_GraphCard " + name);
      for (GraphComponent component : graphCardsComponents)
         component.display(indent);
   }
}
