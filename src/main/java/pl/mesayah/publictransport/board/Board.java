package pl.mesayah.publictransport.board;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import pl.mesayah.publictransport.model.Stop;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class Board {

    private Integer width;
    private Integer height;
    private Group canvas;
    private Set<Stop> stops;

    public Board(Integer width, Integer height) {

        this.width = width;
        this.height = height;
        this.canvas = new Group();
    }

    public Set<Stop> getStops() {

        return stops;
    }

    public void setStops(Set<Stop> stops) {

        this.stops = stops;
    }

    public Integer getWidth() {

        return width;
    }

    public void setWidth(Integer width) {

        this.width = width;
    }

    public Integer getHeight() {

        return height;
    }

    public void setHeight(Integer height) {

        this.height = height;
    }

    public Group getCanvas() {

        return canvas;
    }

    public void setCanvas(Group canvas) {

        this.canvas = canvas;
    }

    public void spawn(Collection<Stop> stops) {

        this.stops.addAll(stops);

        stops.forEach(stop -> canvas.getChildren().add(stop.getRepresentation()));
    }
}
