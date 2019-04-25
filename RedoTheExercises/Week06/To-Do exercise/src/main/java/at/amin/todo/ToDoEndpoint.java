package at.amin.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class ToDoEndpoint {

    private final ToDoManager toDoManager;

    @GetMapping
    List<ToDo> getAllTask() {
        return toDoManager.findAll();
    }

    @GetMapping("/{id}")
    ToDo findWithId(@PathVariable String id) {
        return toDoManager.findOne(id).orElse(null);
    }

    @PostMapping
    ToDo addTask(@RequestBody ToDo toDo) {
        return toDoManager.saveToDo(toDo);
    }

    @PutMapping("/{id}/done")
    ToDo updateToDos(@PathVariable String id) {
        return toDoManager.markAsDone(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    void deleteTask(@PathVariable String id) {
        toDoManager.deleteOne(id);
    }

    @DeleteMapping
    void deleteAllTasks() {
        toDoManager.deleteAll();
    }
}
