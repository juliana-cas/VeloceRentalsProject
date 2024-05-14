package cue.edu.velocerentals.mapping.mappers;

import cue.edu.velocerentals.mapping.mappers.Dtos.VehiclesDto;
import cue.edu.velocerentals.models.Vehicles;

public class MapperVehicles {

    public static VehiclesDto mapFrommodels(Vehicles vehicles){
        return new VehiclesDto(vehicles.getId(), vehicles.getCategory(), vehicles.getType(), vehicles.getPrice(), vehicles.isAvailable());
    }
    public static Vehicles mapFromto(VehiclesDto vehiclesDto){
        return Vehicles.builder()
                .id(vehiclesDto.id())
                .category(vehiclesDto.category())
                .type(vehiclesDto.type())
                .price(vehiclesDto.price())
                .available(vehiclesDto.available())
                .build();
    }
}
