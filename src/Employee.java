/**
 * This class is for the Employee information
 * All the information which is related to the Employee is saved in the database _ can't be changed _
 */

public class Employee {

    private String username;
    private String emp_name;
    private String emp_phone;
    private String emp_email;
    private String password;

    public Employee() {
    }

    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", emp_phone='" + emp_phone + '\'' +
                ", emp_email='" + emp_email + '\'' +
                '}';
    }
}
