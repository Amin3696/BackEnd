package at.amin.studentservice.repositories;

import at.amin.studentservice.domian.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@ConfigurationProperties("school")
public class StudentRepository {

    @Getter
    @Setter
    private List<Student> students;

    public Optional<Student> getStudentWithId(int id) {
        return students.stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }

}
