package at.amin.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDoManager {

    private final ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public Optional<ToDo> findOne(String id) {
        return toDoRepository.findById(id);
    }

    public ToDo saveToDo(ToDo todo) {
        return toDoRepository.save(todo);
    }

    public Optional<ToDo> markAsDone(String id) {
        Optional<ToDo> task = toDoRepository.findById(id);
        if (task.isEmpty()) {
            return Optional.empty();
        }
        ToDo toDo = task.get();
        toDo.setDone(true);
        toDoRepository.save(toDo);
        return Optional.of(toDo);
    }

    public void deleteOne(String id) {
        toDoRepository.deleteById(id);
    }

    public void deleteAll() {
        toDoRepository.deleteAll();
    }
}
