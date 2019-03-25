package at.nacs.todos.configuration;

import at.nacs.todos.persistance.ToDo;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ToDoConfiguration {

    @Setter
    private List<ToDo> toDos;

    @Bean
    List<ToDo> toDos() {
        return toDos;
    }
}
