package Problem4;

// Triangle class represent a triangle shape.
public class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;


  /**
   * Constructs a triangle with the given name and sides.
   * 
   * @param name The name of the triangle.
   * @param side1  The length of the first side.
   * @param side2  The length of the second side.
   * @param side3  The length of the third side.
   */
  public Triangle(String name, double side1, double side2, double side3) {
    super(name);
    if (isValidTriangle(side1, side2, side3)) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      System.out.println("Error: Invalid triangle sides.");
      System.exit(1);
    }

    
  }

  private boolean isValidTriangle(double side1, double side2, double side3) {
    return side1 + side2 > side3 && (side2 + side3 > side1) && (side3 + side1 > side2); 
  }

  @Override
  public double computePerimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public double computeArea() {
    double s = computePerimeter() / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  @Override
  public void scale(double factor) {
    side1 *= factor;
    side2 *= factor;
    side3 *= factor;
  }
  
}
