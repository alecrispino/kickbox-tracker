package at.alessandro.kickbox_tracker.repository;

import at.alessandro.kickbox_tracker.model.TrainingNote;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TrainingNoteRepository extends MongoRepository<TrainingNote, String>{

    List<TrainingNote> findByTrainingSessionId(Long trainingSessionId);
}