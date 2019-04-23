package at.amin.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/toDoApi")
@RequiredArgsConstructor
public class ToDoEndpoint {

    private final ToDoManager toDoManager;

    @GetMapping
    List<ToDo> getAllTask() {
        return toDoManager.findAll();
    }

    @GetMapping("/{id}")
    ToDo findWithId(@PathVariable String id) {
        Optional<ToDo> oneTask = toDoManager.findOne(id);
        return oneTask.get();
    }

    @PostMapping
    ToDo addTask(@RequestBody ToDo toDo) {
        return toDoManager.saveToDo(toDo);
    }

    @PutMapping("/{id}/done")
    Optional<ToDo> updateToDos(@PathVariable String id) {

        return toDoManager.markAsDone(id);
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
