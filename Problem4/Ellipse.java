package Problem4;

// Ellipse class represents as ellipse shape.
public class Ellipse extends Shape {
  private double majorAxis;
  private double minorAxis;

  /**
   * Constructs an ellipse with the given name, major axis and minor axis.
   * 
   * @param name  The name of the ellipse.
   * @param majorAxis  The major axis of the ellipse.
   * @param minorAxis  The minor axis of the ellipse.
   */
  public Ellipse(String name, double majorAxis, double minorAxis) {
    super(name);
    this.majorAxis = Math.max(majorAxis, minorAxis);
    this.minorAxis = Math.min(majorAxis, minorAxis);
  }

  @Override
  public double computePerimeter() {
    return Math.PI * (2 *  Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) /2) - (majorAxis - minorAxis) * (majorAxis - minorAxis) / 2);

  }
    
  @Override
  public double computeArea() {
    return Math.PI * majorAxis * minorAxis;
    
  }

  @Override
  public void scale(double factor) {
    majorAxis *= factor;
    minorAxis *= factor;
  }
  
  
}
