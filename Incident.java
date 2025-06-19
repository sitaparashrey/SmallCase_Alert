import java.time.LocalDate;
import java.time.LocalDateTime;

public class Incident {
    
    private String incidentId;
    private Project project;
    private String description;
    private LocalDateTime timestamp;

    public Incident(String incidentId, Project project) {
        this.incidentId = incidentId;
        this.project = project;
        this.description = "";
        this.timestamp = LocalDateTime.now();
    }

    public String getIncidentId() {
        return incidentId;
    }




}
