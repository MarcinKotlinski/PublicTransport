package pl.mesayah.publictransport.board;

import javafx.scene.canvas.Canvas;
import pl.mesayah.publictransport.model.Stop;

import java.util.Set;

public class Board {

    private Integer width;
    private Integer height;
    private Canvas canvas;
    private Set<Stop> stops;

    public Board(Integer width, Integer height) {

        this.width = width;
        this.height = height;
        this.canvas = new Canvas(width, height);
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

    public Canvas getCanvas() {

        return canvas;
    }

    public void setCanvas(Canvas canvas) {

        this.canvas = canvas;
    }

    public void spawn(Stop stop) {

    }
}
