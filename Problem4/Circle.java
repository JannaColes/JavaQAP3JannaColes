package Problem4;

// Circle class represents a circle shape.
public class Circle extends Shape {
  private double radius;

  /**
   * Constructs a circle with the given name and radius.
   * 
   * @param name  The name of the circle.
   * @param radius  The radius of the circle.
   */
  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  @Override
  public double computePerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double computeArea() {
    return Math.PI * radius * radius;
  }

  @Override 
  public void scale(double factor) {
    radius *= factor;
  }
  
}
