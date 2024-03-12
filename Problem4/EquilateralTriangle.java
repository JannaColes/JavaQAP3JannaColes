package Problem4;

// EquilateralTriangle class represents an equilateral triangle shape.
public class EquilateralTriangle extends Triangle {



  /**
   * Constructs and equilateral triangle with the given name and side length.
   * 
   * @param name  The name of the equilateral triangle.
   * @param side  The length of each side.
   */
  public EquilateralTriangle(String name, double side) {
    super(name, side, side, side);
  }
  
}
