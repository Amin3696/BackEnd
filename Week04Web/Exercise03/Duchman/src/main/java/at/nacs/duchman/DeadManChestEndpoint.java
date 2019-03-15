package at.nacs.duchman;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deadmanschest")
@RequiredArgsConstructor
public class DeadManChestEndpoint {
    final DeadMansChest deadMansChest;

    @GetMapping({"input"})
    DeadMansChest getDeadman(@PathVariable String input) {
        deadMansChest.setItem(input);
        return deadMansChest;
    }
}
