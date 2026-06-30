package at.alessandro.kickbox_tracker.repository;

import at.alessandro.kickbox_tracker.model.TrainingSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingSessionRepository extends JpaRepository<TrainingSession, Long>{
    
}