package pl.mesayah.publictransport.model;

import javafx.scene.shape.Shape;
import javafx.scene.shape.TriangleMesh;

import java.awt.geom.Point2D;
import java.util.List;

public class TramStop extends Stop {

    public TramStop(String place, Point2D location, List<Line> lines) {

        // TODO: triangle polygon
        super(place, location, lines, null);
    }
}
