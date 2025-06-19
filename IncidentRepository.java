import java.util.HashMap;
import java.util.Map;

public class IncidentRepository {
    
    Map<String, Incident> incidents;

    public IncidentRepository() {
        this.incidents = new HashMap<>();
    }

    public void addIncident(Incident incident) throws Exception {
        if(incidents.containsKey(incident.getIncidentId())) {
            System.out.println("Incident with ID " + incident.getIncidentId() + " already exists.");
            throw new Exception("Incident already exists");
        }
        incidents.put(incident.getIncidentId(), incident);
    }



}
