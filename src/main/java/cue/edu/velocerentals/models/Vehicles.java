package cue.edu.velocerentals.models;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Vehicles {

    private int id;
    private Category category;
    private String type;
    private int price;
    private boolean available;

    }