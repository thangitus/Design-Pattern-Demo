public interface ComputerComponent {
   void display(String indent);

   int getPrice();

   int accept(Visitor visitor);
}
