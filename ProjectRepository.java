import java.util.Map;
public class ProjectRepository {
    
    Map<String,Project> projects;
    EmployeeRepository employeeRepository;

    public ProjectRepository(EmployeeRepository employeeRepository) {
        this.projects = new java.util.HashMap<>();
        this.employeeRepository = employeeRepository;
    }

    public Project getProject(String projectId) {
        return projects.get(projectId);
    }

    public void addProject(String projectName, String projectId) {

        Project project = new Project(projectName, projectId);
        if(projects.containsKey(projectId)) {
            System.out.println("Project with ID " + project.getProjectId() + " already exists.");
            return ;
        }
        projects.put(projectId, project);
        System.out.println("Project added fine");
       
        return ;
    }

    public void assignEmployee(String projectId, String empID, int level) {
        Project project = projects.get(projectId);

        if(project.employeesLevelMap.containsKey(level)) {
            System.out.println("Already Employee at that level exist");
            return ;
        }
        project.employeesLevelMap.put(level, employeeRepository.getEmployeeById(empID));

        System.out.println("Employee Added at level " + level);

        return;
    }
}
