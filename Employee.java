public class Employee {
    
    private String name;
    private String id;
    private String number;
    private String email;
    
    public Employee(String name, String id, String number, String email) {
        this.name = name;
        this.id = id;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }
    public String getEmail() {
        return email;
    }
}
