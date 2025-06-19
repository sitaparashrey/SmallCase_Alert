import java.util.List;
import java.util.Map;

public class Project {
    
    private String projectName;
    private String projectId;
    Map<Integer,Employee> employeesLevelMap;

    public Project(String projectName, String projectId) {
        this.projectName = projectName;
        this.projectId = projectId;
        this.employeesLevelMap = new java.util.HashMap<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectId(){
        return projectId;
    }


    public Employee getEmployeeAtLevel(int level) {
        return employeesLevelMap.get(level);
    }

}
