public interface NotificationStrategy{
    
    boolean notify(Employee employee, Incident incident, String message);
}
