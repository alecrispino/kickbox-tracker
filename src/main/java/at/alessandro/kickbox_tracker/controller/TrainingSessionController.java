package at.alessandro.kickbox_tracker.controller;

import at.alessandro.kickbox_tracker.model.TrainingSession;
import at.alessandro.kickbox_tracker.service.TrainingSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/sessions")
public class TrainingSessionController{
    private final TrainingSessionService service;

    public TrainingSessionController(TrainingSessionService service){
        this.service = service;
    }    

    @GetMapping
    public List<TrainingSession> getAllSessions() {
        return service.getAllSessions();
    }

    @PostMapping
    public TrainingSession createSession(@RequestBody TrainingSession session) {
        return service.createSession(session);
    }

    @GetMapping("/{id}")
    public TrainingSession getSessionbyId(@PathVariable Long id) {
        return service.getSessionById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable Long id){
        service.deleteSession(id);
    }
    
    
    
}