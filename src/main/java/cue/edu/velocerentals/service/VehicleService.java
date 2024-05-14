package cue.edu.velocerentals.service;

import java.sql.SQLException;
import java.util.List;

public interface VehicleService <T>{
    List<T> listVehicles() throws SQLException;
}
