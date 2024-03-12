package Problem2;


// MovablePoint class represents a point in 2D space that can move.
public class MovablePoint extends Point {
  private float xSpeed;
  private float ySpeed;


/**
 * Constructs a movable point with the given coordinates and speeds.
 * 
 * @param x    The x-coordinate of the point.
 * @param y    The y-coordinate of the point.
 * @param xSpeed  The speed in the x-direction.
 * @param ySpeed   The speed in the y-direction.
 */  
  
  public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  
/**
 * Constructs a movable point with zero coordinates and speeds.
 */

/** 
 * Constructs a movable point with zero coordinates and the given speeds.
 * 
 * @param xSpeed The speed in the x-direction.
 * @param ySpeed The speed in the y-direction.
 */ 

  public MovablePoint(float xSpeed, float ySpeed) {
    this(0.0f, 0.0f, xSpeed, ySpeed);
  }


/**
 * Getter method for the speed in the x-direction.
 *  
 * @return The speed in the x-direction.
 */
  public float getXSpeed() {
    return xSpeed;
  }


/**
 * Setter method for the speed in the x-direction.
 * 
 * @param xSpeed The new speed in the x-direction.
 */
  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

/**
 * Getter method for the speed in the y-direction.
 * 
 * @return The speed in the y-direction.
 */  
  public float getYSpeed() {
    return ySpeed;
  }

/**
 * Setter method for the speed in the y-direction.
 * 
 * 
 * @param ySpeed The new speed in the y-direction.
 */  
  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }

/**
 * Sets the speeds in both x and y directions.
 * 
 * @param xSpeed The new speed in the x-direction.
 * @param ySpeed The new speed in the y-direction.
 */  
  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }


/**
 * Returns an array containing the speeds in x and y directions.
 * 
 * @return An array containing the speeds in x and y directions.
 */
  public float[] getSpeed() {
    return new float[]{xSpeed, ySpeed};
  }

  /**
   * Move the point by its current speeds and returns itself.
   * 
   * @return The moved point.
   */
  public MovablePoint move() {
    setX(getX() + xSpeed);
    setY(getY() + ySpeed);
    return this;
}


/**
 * Returns a string representation of the movable point.
 *
 * @return A string representation of the movable point.
 */
  @Override
  public String toString() {
      return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
  }

 

}
  

