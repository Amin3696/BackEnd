package at.amin.tweeter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tweet {

    private String id;
    private String user;
    private String message;
    private int like;
    private List<String> comments;
    private LocalDateTime timestamp;

}
