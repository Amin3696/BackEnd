package at.nacs.marathonserver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/runners")
@RequiredArgsConstructor

public class RunnersEndpoint {
    private final RunnerRepository runnerRepository;

    @GetMapping
    List<Runner> runners() {
        return runnerRepository.findAll();
    }

    @PostMapping
    Runner add(@RequestBody Runner runner) {
        runnerRepository.add(runner);
        return runner;
    }

}
