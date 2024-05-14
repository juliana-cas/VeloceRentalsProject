package cue.edu.velocerentals.repository;

import cue.edu.velocerentals.mapping.mappers.Dtos.VehiclesDto;
import cue.edu.velocerentals.mapping.mappers.MapperVehicles;
import cue.edu.velocerentals.models.Vehicles;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cue.edu.velocerentals.models.Category;
public class RepoJDBCImpl  implements Repository<VehiclesDto>{

    private Connection connection;

    private Vehicles createVehicle(ResultSet resultSet) throws SQLException {
        Vehicles vehicles = new Vehicles();
        vehicles.setId(resultSet.getInt("id"));

        String categoryString = resultSet.getString("Category");
        Category category = Category.valueOf(categoryString); // Convertir el String a Enum
        vehicles.setCategory(category);
        vehicles.setType(resultSet.getString("Type"));
        vehicles.setPrice(resultSet.getInt("Price"));
        vehicles.setAvailable(resultSet.getBoolean("Available"));
        return vehicles;
    }

    public List<VehiclesDto> list() throws SQLException{
        List<VehiclesDto> vehiclesDtos = new ArrayList<>();
        try (Statement statement= connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from vehiculos")){
            while (resultSet.next()){
                Vehicles vehicles = createVehicle(resultSet);
                VehiclesDto vehiclesDto = MapperVehicles.mapFrommodels(vehicles);
                vehiclesDtos.add(vehiclesDto);
            }
        }
        return vehiclesDtos;
    }

    private Vehicles createvehicles(ResultSet resultSet){
        return null;
    }
    public VehiclesDto byId(int id){
        return null;
    }

    public void save(VehiclesDto vehiclesDto){

    }
    public void delete(int id){

    }
    public void update(VehiclesDto vehiclesDto){
    }
}
