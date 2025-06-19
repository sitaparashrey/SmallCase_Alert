public class CallNotfication implements NotificationStrategy {
    
    @Override
    public boolean notify(Employee employee, Incident incident, String message) {

        System.out.println("Calling third party for incident to have a call notification");
        return true;
    }


}
