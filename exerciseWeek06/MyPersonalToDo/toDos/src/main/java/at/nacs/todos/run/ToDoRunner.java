package at.nacs.todos.run;

import at.nacs.todos.persistance.ToDo;
import at.nacs.todos.persistance.ToDoRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ToDoRunner {

    @Bean
    ApplicationRunner applicationRunner(List<ToDo> toDos, ToDoRepository repository) {
        return args ->{
            System.out.println("---To Dos---");

    };
    }
}
