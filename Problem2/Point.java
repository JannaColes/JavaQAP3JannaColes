package Problem2;


// Point class represents a point in 2D space.
public class Point {
  private float x;
  private float y;

/**
 * Constructs a point with the given coordinates.
 * 
 * @param x The x-coordinate of the point.
 * @param y The y-coordinate of the point.
 */  
  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Constructs a point at the origin (0,0).
   */
  public Point() {
    this(0.0f, 0.0f);
  }


/**
 * Getter method for the x-coordinate of the point.
 * 
 * @return The x-coordinate of the point.
 */  
  public float getX() {
    return x;
  }


/**
 * Setter method for the x-coordinate of the point.
 * 
 * @param x The new x-coordinate of the point.
 */  
  public void setX(float x) {
    this.x = x;
  }


/**
 * Getter method for the y-coordinate of the point.
 * 
 * @return The y-coordinate of the point.
 */  
  public float getY() {
    return y;
  }

  
/**
 * Setter method for the y-coordinate of the point.
 * 
 * @param y The new y-coordinate of the point.
 */  
  public void setY(float y) {
    this.y = y;
  }

  /**
   * Sets the coordinates of the point.
   * 
   * @param x The new x-coordinate of the point.
   * @param y The new y-coordinate of the point. 
   */

   public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
   }

/**
 * Returns an array containing the x and y coordinates of the point.
 * 
 * @return An array containing the x and y coordinates of the point. 
 */

public float[] getXY() {
  return new float[] { x, y };
} 



/**
 * Returns a string representation of the point.
 * 
 * @return A string representation of the point.
 */
@Override
  public String toString() {
    return "(" + x + "," + y + ")";
  }
  
}
