package Problem4;

// Abstract class Shape represents a generic shape with a name, perimeter and area.
public abstract class Shape implements Scalable {
  protected String name;

  /**
   * Constructs a shape with the given name.
   * 
   * @param name The name of the shape.
   */
  public Shape(String name) {
    this.name = name;
  }

  /**
   * Abstract method to compute the perimeter of the shape.
   * 
   * @return The perimeter of the shape.
   */
  public abstract double computePerimeter();

  /**
   * Abstract method to compute the area of the shape.
   * 
   * @return The area of the shape.
   */
  public abstract double computeArea();

  /**
   * Returns a string representation of the shape.
   * 
   * @return A string representation of the shape.
   */
  @Override
  public void scale(double factor) {
    System.out.println("Scaling shape: " + name);
  }

  @Override
  public String toString() {
    return "Shape: " + name + ", Perimeter: " + computePerimeter() + ", Area: " + computeArea();
  }
  
}
