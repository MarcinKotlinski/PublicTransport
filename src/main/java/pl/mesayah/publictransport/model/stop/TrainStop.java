package pl.mesayah.publictransport.model.stop;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import pl.mesayah.publictransport.model.Line;

import java.util.List;

public class TrainStop extends Stop {

    public TrainStop(String place, Point2D location, List<Line> lines) {

        super(place, location, lines, new Rectangle(location.getX(), location.getY(), 20, 20));
        this.getRepresentation().setFill(Color.BLUE);
    }
}
