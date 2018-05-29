package pl.mesayah.publictransport.model.stop;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import pl.mesayah.publictransport.model.Line;

import java.util.List;

public class TramStop extends Stop {

    public TramStop(String place, Point2D location, List<Line> lines) {

        // TODO: triangle polygon
        super(place, location, lines, new Polygon(
                location.getX(),
                location.getY() + 11,
                location.getX() - 10,
                location.getY() - 6,
                location.getX() + 10,
                location.getY() + 6
        ));
        this.getRepresentation().setFill(Color.RED);
    }
}
