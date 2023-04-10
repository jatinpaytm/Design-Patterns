package Visitor;
//https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm
//Step 5
//Use the ComputerPartDisplayVisitor to display parts of Computer.
public class VisitorPatternDemo {
    public static void main(String[] args) {

        // it will only print keyboard
        ComputerPart keyboard = new Keyboard();
        keyboard.accept(new ComputerPartDisplayVisitor());
        // it will only print monitor
        ComputerPart monitor = new Monitor();
        monitor.accept(new ComputerPartDisplayVisitor());
        // it will only print mouse
        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());

        // This will print all computer parts
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
