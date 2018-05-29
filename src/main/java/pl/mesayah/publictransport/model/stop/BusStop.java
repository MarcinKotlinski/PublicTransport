package pl.mesayah.publictransport.model.stop;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import pl.mesayah.publictransport.model.Line;

import java.util.List;

public class BusStop extends Stop {

    public BusStop(String place, Point2D location, List<Line> lines) {

        super(place, location, lines, new Circle(location.getX(), location.getY(), 10, Color.GREEN));
    }
}
