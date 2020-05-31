package widgets;

import java.util.Map;

import edu.wpi.first.shuffleboard.api.data.ComplexData;

public final class Point2D extends ComplexData<Point2D> {

  private final double x;
  private final double y;

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  @Override
  public Map<String, Object> asMap() {
    return Map.of("x", x, "y", y);
  }

  public Point2D withX(double x) {
    return new Point2D(x, this.y);
  }

  public Point2D withY(double y) {
    return new Point2D(this.x, y);
  }

  // equals, hashcode, toString, etc. omitted for brevity

}