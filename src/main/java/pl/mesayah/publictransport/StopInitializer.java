package pl.mesayah.publictransport;

import javafx.geometry.Point2D;
import pl.mesayah.publictransport.model.BusStop;
import pl.mesayah.publictransport.model.Line;
import pl.mesayah.publictransport.model.Stop;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class StopInitializer {

    private Collection<Stop> stops;

    public StopInitializer() {

        stops = new HashSet<>();

        stops.add(new BusStop("Oksywie Dolne", new Point2D(100, 100), Collections.emptyList()));
        stops.add(new BusStop("Oksywie Górne", new Point2D(100, 400), Collections.emptyList()));
        stops.add(new BusStop("Akademia Marynarki Wojennej", new Point2D(150, 600), Collections.emptyList()));
        stops.add(new BusStop("Pogórze Górne", new Point2D(400, 200), Collections.emptyList()));
        stops.add(new BusStop("Obłuże Centrum", new Point2D(600, 400), Collections.emptyList()));
    }

    public Collection<Stop> getStops() {

        return stops;
    }
}
