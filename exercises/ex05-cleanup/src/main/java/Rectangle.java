/**
 * A rectangle with a width and a height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param w the width
   * @param h the height
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the width multiplied by the height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions by the given factor.
   *
   * @param factor the multiplier for the width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Checks whether this rectangle has a larger area than another rectangle.
   *
   * @param other the rectangle to compare with
   * @return whether this rectangle has a larger area
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
