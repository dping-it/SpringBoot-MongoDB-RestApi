package it.dping.backend.repository;

import it.dping.backend.models.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByPublished(boolean published);

    //you can use MongoRepository’s methods: save(), findOne(),
    // findById(), findAll(), count(), delete(), deleteById() whitout
    // other metod implementation
}
