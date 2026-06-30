package at.alessandro.kickbox_tracker.controller;

import at.alessandro.kickbox_tracker.model.TrainingNote;
import at.alessandro.kickbox_tracker.service.TrainingNoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/notes")
public class TrainingNoteController {
    private final TrainingNoteService service;

    public TrainingNoteController(TrainingNoteService service){
        this.service = service;
    }

    @GetMapping
    public List<TrainingNote> getAllNotes() {
        return service.getAllNotes();
    }

    @PostMapping
    public TrainingNote createNote(@RequestBody TrainingNote note) {
        return service.createNote(note);
    }

    @GetMapping("/by-session/{sessionId}")
    public List<TrainingNote> getNotesForSession(@PathVariable Long sessionId) {
        return service.getNotesForSession(sessionId);
    }

    @DeleteMapping
    public void deleteNote(@PathVariable String id){
        service.deleteNote(id);
    }
    
    
    
}