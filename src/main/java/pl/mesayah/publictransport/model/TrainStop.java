package pl.mesayah.publictransport.model;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class TrainStop extends Stop {

    public TrainStop(String place, Point2D location, List<Line> lines) {

        super(place, location, lines, new Rectangle(20, 20, Color.BLUE));
    }
}
