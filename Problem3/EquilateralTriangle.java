package Problem3;

// EquilateralTriangle class represents an equilateral triangle shape.
public class EquilateralTriangle extends Triangle {

  /**
   * Constructs an equilateral triangle with the given name and side length.
   * 
   * @param name  The name of the equilateral triangle.
   * @param side  The length of each side.
   */
  public EquilateralTriangle(String name, double side) {
    super(name, side, side, side);
  }
  
  @Override
  public double computeArea() {
    double s = computePerimeter() / 2;
    return Math.sqrt(3) / 4 * s * s;
  }
}
