package cue.edu.velocerentals.models;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {

    private int id;
    private String username;
    private String password;
    private String email;

}
