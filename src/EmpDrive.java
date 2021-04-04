import java.sql.SQLException;
import java.util.Scanner;

/**
 * this class only get the username and the password and make sure if they are true and are in the database
 * enter the program..
 * <p>
 * Has the main statement.
 */
public class EmpDrive {
    public void check(String u, String pw) throws SQLException {
        Employee emp = new Employee();

        if (u.equals("fatima") && pw.equals("afa")) {
            Menu start = new Menu();
        } else {
            System.out.println(" wrong user or password please try again!");
            EmpDrive a = new EmpDrive();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user;
        String password;

        EmpDrive s = new EmpDrive();

        System.out.println("Please Enter username and password:");
        user = input.nextLine();
        password = input.nextLine();

        try {
            s.check(user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}