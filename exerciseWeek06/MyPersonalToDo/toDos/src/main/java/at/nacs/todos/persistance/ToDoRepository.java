package at.nacs.todos.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository <ToDo,String>{




}
