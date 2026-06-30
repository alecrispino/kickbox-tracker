package at.alessandro.kickbox_tracker.service;

import at.alessandro.kickbox_tracker.model.TrainingSession;
import at.alessandro.kickbox_tracker.repository.TrainingSessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingSessionService {

    private final TrainingSessionRepository repository;

    public TrainingSessionService(TrainingSessionRepository repository){
        this.repository = repository;
    }

    public List<TrainingSession> getAllSessions(){
        return repository.findAll();
    }

    public TrainingSession createSession(TrainingSession session){
        return repository.save(session);
    }

    public TrainingSession getSessionById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Training Session mit der ID " + id + " wurde nicht gefunden."));
    }

    public void deleteSession(Long id){
        repository.deleteById(id);
    }
}