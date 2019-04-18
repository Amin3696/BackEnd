package at.amin.studentservice.communication;

import at.amin.studentservice.domian.Student;
import at.amin.studentservice.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StudentEndPoint {
    private final StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Optional<Student> getStudentWithId(@PathVariable int studentId) {
        return studentRepository.getStudentWithId(studentId);
    }
}
