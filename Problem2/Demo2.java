package Problem2;

// Demo class demonstrates the usage of Point and MovablePoint classes.
public class Demo2 {
  public static void main(String[] args) {
    Point point = new Point(3.5f, 4.5f);
    System.out.println("Point: " + point);

    MovablePoint movablePoint = new MovablePoint(2.5f, 3.5f, 1.0f, 1.5f);
    System.out.println("Movable Point: " + movablePoint);

    movablePoint.move();
    System.out.println("After moving: " + movablePoint);
  }
  
}
