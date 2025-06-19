public class NotificationService {
    
    
    public NotificationStrategy notificationStrategy;
    
    public void notifyEmployee(Employee employee, Incident incident, String message) throws IllegalArgumentException {

        if(employee == null || incident == null || message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Employee, incident, and message must not be null or empty");
        }

        boolean res = notificationStrategy.notify(employee, incident, message);
        if(res) {
            System.out.println("Notification sent successfully to " + employee.getName());
        } else {
            System.out.println("Failed to send notification to " + employee.getName());
        }
        return ;
    }
}
