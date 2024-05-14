package cue.edu.velocerentals.mapping.mappers.Dtos;

public record UserDto(
        int user_id,
        String username,
        String password,
        String email) {
}
