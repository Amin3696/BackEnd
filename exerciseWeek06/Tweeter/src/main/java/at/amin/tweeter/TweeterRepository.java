package at.amin.tweeter;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TweeterRepository extends MongoRepository<Tweet, String> {

    List<Tweet> findByOrderBOrderByTimestampDesc();

    List<Tweet> findByUserOOrderByTimestampDesc(String id);

}