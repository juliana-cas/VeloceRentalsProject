package cue.edu.velocerentals.mapping.mappers.Dtos;

import cue.edu.velocerentals.models.Category;

public record VehiclesDto(
        int id,
        Category category,
        String type,
        int price,
        boolean available
        ) {
}
