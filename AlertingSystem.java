import java.util.Scanner;

public class AlertingSystem {


    public static void main(String[] args) {

        EmployeeRepository employeeRepository = new EmployeeRepository();
        ProjectRepository projectRepository = new ProjectRepository(employeeRepository);
        IncidentRepository incidentRepository = new IncidentRepository();
        IncidentService incidentService = new IncidentService(projectRepository, incidentRepository);
        employeeRepository.addEmployee("Shrey","1","test@gmail.com","9877");
        employeeRepository.addEmployee("Rohan","2","test@gmail.com","9877");

    
        projectRepository.addProject("StockService","11");

        projectRepository.assignEmployee("11", "1", 0);
        projectRepository.assignEmployee("11", "2", 0);

        incidentService.createIncident("101","11","description1", NotificationType.CALL);

    }
}