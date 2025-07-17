// File: Inheritance.java (main file)
  // Imports only Account class
       // Imports all classes inside 'bank' package


// Base class
class Shape {
    int area;

    public void area() {
        System.out.println("Area of shape is " + area);
    }
}

// Triangle inherits from Shape
class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println("Area of triangle: " + (0.5 * l * b));
    }
}

// Circle inherits from Shape
class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of circle: " + (Math.PI * r * r));
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();

        t1.area(10, 5);  // Triangle area
        c1.area(7);      // Circle area


    }
}
