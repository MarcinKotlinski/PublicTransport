package pl.mesayah.publictransport.model;

import javafx.geometry.Point2D;
import javafx.scene.shape.Shape;

import java.util.List;

public abstract class Stop {

    private String place;
    private Point2D location;
    private List<Line> lines;
    private Shape representation;

    public Stop(String place, Point2D location, List<Line> lines, Shape representation) {

        this.place = place;
        this.location = location;
        this.lines = lines;
        this.representation = representation;
    }

    public String getPlace() {


        return place;
    }

    public void setPlace(String place) {

        this.place = place;
    }

    public Point2D getLocation() {

        return location;
    }

    public void setLocation(Point2D location) {

        this.location = location;
    }

    public List<Line> getLines() {

        return lines;
    }

    public void setLines(List<Line> lines) {

        this.lines = lines;
    }

    public Shape getRepresentation() {

        return representation;
    }

    public void setRepresentation(Shape representation) {

        this.representation = representation;
    }
}
