package at.alessandro.kickbox_tracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Document(collection = "training_notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingNote {

    @Id
    private String id;

    private Long trainingSessionId;

    private String text;

    private List<String> tags;
}