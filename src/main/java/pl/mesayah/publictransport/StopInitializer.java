package pl.mesayah.publictransport;

import javafx.geometry.Point2D;
import pl.mesayah.publictransport.model.stop.BusStop;
import pl.mesayah.publictransport.model.stop.Stop;
import pl.mesayah.publictransport.model.stop.TrainStop;
import pl.mesayah.publictransport.model.stop.TramStop;

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

        stops.add(new TrainStop("Gdynia Główna", new Point2D(100, 250), Collections.emptyList()));
        stops.add(new TrainStop("Gdynia Stocznia", new Point2D(300, 300), Collections.emptyList()));
        stops.add(new TrainStop("Gdynia Leszczynki", new Point2D(350, 600), Collections.emptyList()));
        stops.add(new TrainStop("Gdynia Redłowo", new Point2D(400, 580), Collections.emptyList()));
        stops.add(new TrainStop("Gdynia Cisowa", new Point2D(700, 650), Collections.emptyList()));

        stops.add(new TramStop("Dworzec Główny", new Point2D(200, 300), Collections.emptyList()));
        stops.add(new TramStop("Armii Krajowej", new Point2D(200, 150), Collections.emptyList()));
        stops.add(new TramStop("Władysława IV", new Point2D(460, 370), Collections.emptyList()));
        stops.add(new TramStop("Świętojańska", new Point2D(750, 200), Collections.emptyList()));
        stops.add(new TramStop("Gdynia Orłowo", new Point2D(150, 650), Collections.emptyList()));
    }

    public Collection<Stop> getStops() {

        return stops;
    }
}
