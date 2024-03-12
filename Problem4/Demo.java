package Problem4;

// Demo class demonstrates the usage of Shape and Scalable interface.
public class Demo {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[4];
    shapes[0] = new  Circle("Circle", 5.0);
    shapes[1] = new Ellipse("Ellipse", 4.0, 6.0);
    shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
    shapes[3] = new EquilateralTriangle("Equilateral Triangle", 4.0);
  
    printShapes("Before Scaling", shapes);
    scaleShapes(shapes, 2.0);
    printShapes("After Scaling", shapes);
  }
    

  public static void printShapes(String message, Shape[] shapes) {
    System.out.println(message + ":");
    for (Shape shape : shapes) {
      System.out.println(shape);
    }
  }

  private static void scaleShapes(Scalable[] scalables, double factor) {
    for (Scalable scalable : scalables) {
      scalable.scale(factor);
    }
  }

  
}
