package at.amin.tweeter;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
@RequiredArgsConstructor
public class TweeterEndpoint {
    private final Tweeter tweeter;

    @GetMapping
    List<Tweet> findAll() {
        return tweeter.findAll();
    }

    @GetMapping("/user/{user}")
    List<Tweet> findById(@PathVariable String user) {
        return tweeter.findBy(user);
    }

    @PostMapping
    Tweet post(@RequestBody Tweet tweet) {
        return tweeter.saveTweet(tweet);
    }

    @PutMapping("/{id}/likes")
    void like(@PathVariable String id) {
        tweeter.like(id);
    }

    @PutMapping("{id}/comments")
    void comment(@PathVariable String id, @RequestBody String comment) {
        tweeter.addComment(id, comment);
    }
}
