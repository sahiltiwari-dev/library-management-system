class Pen {
    String colour;
    String type;

    public void printColour() {
        System.out.println(this.colour);
    }
}

public class oops {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.colour = "black";
        pen1.type = "ball";

        Pen pen2 = new Pen();
        pen2.colour = "blue";
        pen2.type = "gel";

        pen1.printColour(); // pen 1 obj is calling print colour function in which there is syso this.colour which knows that main function is calling to print the colour of the obj pen 1


        pen2.printColour(); // prints "blue"
    }
}

