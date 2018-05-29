package pl.mesayah.publictransport.model;

import pl.mesayah.publictransport.model.stop.Stop;
import pl.mesayah.publictransport.model.vehicle.Vehicle;

import java.util.List;
import java.util.Set;

public class Line {

    private String name;
    private Set<Vehicle> vehicles;

    public Set<Vehicle> getVehicles() {

        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {

        this.vehicles = vehicles;
    }

    public String getName() {


        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<Stop> getSchedule() {

        return schedule;
    }

    public void setSchedule(List<Stop> schedule) {

        this.schedule = schedule;
    }

    private List<Stop> schedule;
}
