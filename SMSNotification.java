public class SMSNotification implements NotificationStrategy{

    @Override
    public boolean notify(Employee employee, Incident incident, String message) {
        System.out.println("Sending SMS to " + employee.getName() + " regarding incident: " + message);
        System.out.println("Message: " + message);
        // Stimulate api call for sms
        sendSMS(employee.getNumber(),message);
        return true;
    }

    private boolean sendSMS(String phoneNumber, String message) {
        // Simulate sending SMS
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
        return true;
    }
}
