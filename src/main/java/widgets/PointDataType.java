package widgets;

import java.util.Map;
import java.util.function.Function;

import edu.wpi.first.shuffleboard.api.data.ComplexDataType;

public final class PointDataType extends ComplexDataType<Point2D> {

    private static final String NAME = "MyPoint2D";
    public static final PointDataType Instance = new PointDataType();
 
    private PointDataType() {
       super(NAME, Point2D.class);
    }
 
    @Override
    public Function<Map<String, Object>, Point2D> fromMap() {
       return map -> {
          return new Point2D((double) map.getOrDefault("x", 0.0), (double) map.getOrDefault("y", 0.0));
       };
    }
 
    @Override
    public Point2D getDefaultValue() {
       // use default values of 0 for X and Y coordinates
       return new Point2D(0, 0);
    }
 
 }