package pl.mesayah.publictransport.board;

import javafx.scene.Group;
import pl.mesayah.publictransport.model.stop.Stop;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Board {

    private Integer width;
    private Integer height;
    private Group graphics;
    private Set<Stop> stops;

    public Board(Integer width, Integer height) {

        this.width = width;
        this.height = height;
        this.graphics = new Group();
        this.stops = new HashSet<>();
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

    public Group getGraphics() {

        return graphics;
    }

    public void setGraphics(Group graphics) {

        this.graphics = graphics;
    }

    public void spawn(Collection<Stop> stops) {

        this.stops.addAll(stops);

        stops.forEach(stop -> graphics.getChildren().add(stop.getRepresentation()));
    }
}
