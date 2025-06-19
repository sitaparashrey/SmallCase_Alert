import java.util.Map;

public class EmployeeRepository {
    

    Map<String, Employee> employeeList;

    public EmployeeRepository() {
        this.employeeList = new java.util.HashMap<>();
    }

    public void addEmployee(String name, String id, String email, String number) {
        if(employeeList.containsKey(id)){
            System.out.println("Employee with id exists");
            return ;
        }
        Employee employee = new Employee(name, id, number, email);
        employeeList.put(id,employee);
        System.out.println("Employee added fine");
        return ;
    }

    public Employee getEmployeeById(String empId)
    {
         if(!employeeList.containsKey(empId)){
            System.out.println("ID doesn't exist");
            return null;
        }
        return employeeList.get(empId);
    }
    
}
