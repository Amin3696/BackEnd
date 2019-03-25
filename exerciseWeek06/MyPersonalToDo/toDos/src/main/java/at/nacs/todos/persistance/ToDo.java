package at.nacs.todos.persistance;

import lombok.Data;

@Data
public class ToDo {

    private String id;
    private String title;
    private boolean done;

}
