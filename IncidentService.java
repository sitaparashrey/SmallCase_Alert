import java.util.Map;

public class IncidentService {
    
    private ProjectRepository projectRepository;
    private IncidentRepository incidentRepository;
    private NotificationService notificationService;
    Map<String, Incident> incidents;

    public IncidentService(ProjectRepository projectRepository, IncidentRepository incidentRepository) {
        this.projectRepository = projectRepository;
        this.incidentRepository = incidentRepository;
        this.incidents = new java.util.HashMap<>();
        this.notificationService = new NotificationService();
    }

    public void createIncident(String incidentId, String projectId, String msg, NotificationType notificationType) {
        try {
            Project project = projectRepository.getProject(projectId);
            System.out.println("Found Project " );
        if(project == null ) {
            System.out.println("Project with ID " + projectId + " does not exist.");
            return ;
        }
        Incident incident = new Incident(incidentId, project);
        incidentRepository.addIncident(incident);
        
        Employee employee = project.getEmployeeAtLevel(0);
        System.out.println("Employee "+ employee.getName());
        NotificationFactory notificationFactory = new NotificationFactory();
        notificationService.notificationStrategy = notificationFactory.getStrategy(notificationType);
        notificationService.notifyEmployee(employee, incident, msg);
        
        } catch ( Exception e) {
            System.out.println("Error creating incident: " + e.getMessage());
            return ;
        }
        

    }
}
