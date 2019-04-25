package at.amin.tweeter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Tweeter {

    private final TweeterRepository tweeterRepository;

    public List<Tweet> findAll() {
        return tweeterRepository.findByOrderBOrderByTimestampDesc();
    }

    public List<Tweet> findBy(String user) {
        return tweeterRepository.findByUserOOrderByTimestampDesc(user);
    }

    public Tweet saveTweet(Tweet tweet) {
        tweet.setTimestamp(LocalDateTime.now());
        return tweeterRepository.save(tweet);
    }

    public void like(String id) {
        Optional<Tweet> byId = tweeterRepository.findById(id);
        if (byId.isEmpty()) {
            return;
        }
        Tweet tweet = byId.get();
        int like = tweet.getLike();
        tweet.setLike(like + 1);
    }

    public void addComment(String id, String comment) {
        Optional<Tweet> byId = tweeterRepository.findById(id);
        if (byId.isEmpty()) {
            return;
        }
        Tweet tweet = byId.get();
        tweet.getComments().add(comment);
        tweeterRepository.save(tweet);

    }
}
