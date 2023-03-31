package Visitor;
//Step 1
//Define an interface to represent element.
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
