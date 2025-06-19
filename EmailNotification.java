public class EmailNotification implements NotificationStrategy {

    @Override
    public boolean notify(Employee employee, Incident incident, String message) {
        System.out.println("Sending email to " + employee.getName() + " regarding incident: " + message);
        System.out.println("Message: " + message);
        return true;
    }
    
}
