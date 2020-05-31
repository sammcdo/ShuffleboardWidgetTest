package widgets;

import edu.wpi.first.shuffleboard.api.components.NumberField;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Slider;

@Description(name = "MyPoint2D", dataTypes = Point2D.class)
@ParametrizedController("Point2DWidget.fxml")
public final class Point2dWidget extends SimpleAnnotatedWidget<Point2D> {

   @FXML
   private StackPane root;

   @FXML
   private NumberField xSlider;

   @FXML
   private NumberField ySlider;

   @FXML
   private void initialize() {
      dataProperty().addListener((__, old, newData) -> {
         xSlider.setNumber(newData.getX());
         ySlider.setNumber(newData.getY());
      });
      
      //xSlider.valueProperty().bind(dataOrDefault.map(Point2D::getX));
      //ySlider.valueProperty().bind(dataOrDefault.map(PointDataType::getY));
      //xSlider.valueProperty().addListener((observable, oldValue, newValue) -> setData(getData().withX(newValue.doubleValue())));
      //ySlider.valueProperty().addListener((observable, oldValue, newValue) -> setData(getData().withY(newValue.doubleValue())));
   }

   @Override
   public Pane getView() {
      return root;
   }

 }