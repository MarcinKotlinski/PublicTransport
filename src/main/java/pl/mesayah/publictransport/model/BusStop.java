package pl.mesayah.publictransport.model;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

import java.util.List;

public class BusStop extends Stop {

    public BusStop(String place, Point2D location, List<Line> lines) {

        super(place, location, lines, new Circle(location.getX(), location.getY(), 10, Color.GREEN));
    }
}
