package at.alessandro.kickbox_tracker.service;

import at.alessandro.kickbox_tracker.model.TrainingNote;
import at.alessandro.kickbox_tracker.repository.TrainingNoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingNoteService {
    private final TrainingNoteRepository repository;

    public TrainingNoteService(TrainingNoteRepository repository){
        this.repository = repository;
    }

    public TrainingNote createNote(TrainingNote note){
        return repository.save(note);
    }

    public List<TrainingNote> getNotesForSession(Long trainingSessionId){
        return repository.findByTrainingSessionId(trainingSessionId);
    }

    public List<TrainingNote> getAllNotes(){
        return repository.findAll();
    }

    public void deleteNote(String id){
        repository.deleteById(id);
    }
}