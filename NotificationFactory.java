public class NotificationFactory {
    
    public NotificationStrategy getStrategy(NotificationType notificationType) {
        switch (notificationType) {
            case CALL:
                return new CallNotfication();
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SMSNotification();
            default:
                break;
        }
        return new CallNotfication();
    }
}
