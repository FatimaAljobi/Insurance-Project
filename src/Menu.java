/**
 * This is the Menu.
 * <p>
 * It contains of all the needed libraries.
 */

import java.sql.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

/**
 * also it has all the methods .
 */


public class Menu {
    LinkedList<Customer> customers = new LinkedList();
    LinkedList<Employee> employee = new LinkedList();
    LinkedList<Vehicle> Vehicle = new LinkedList();
    LinkedList<Insurance> Insurance = new LinkedList();
    LinkedList<Compensation> Compensation = new LinkedList();

    Scanner input = new Scanner(System.in);

    public Menu() throws SQLException {


        System.out.println("     ************************************************ \n");
        System.out.println("                Welcome to our company \n");
        System.out.println("     ************************************************ \n\n");

        System.out.println("\n\n\t\t\tEnter your choice please:\n\n\t\t\t");
        System.out.println("\n\n\t\t\t\1.create an account(1) \n\t\t\t\2.view an account(2) \n\t\t\t\3.delete an account(3) \n\t\t\t\4.edit an account(4)\n\t\t\t\5.search an account(5)\n\t\t\t");
        System.out.println("\n\n\t\t\t if u wanna exit enter 0");
        int choice = 1;

        while (choice != 0) {
            System.out.println("     ************************************************ \n");
            System.out.println("                Welcome to our company \n");
            System.out.println("     ************************************************ \n\n");

            System.out.println("\n\n\t\t\tEnter your choice please:\n\n\t\t\t");
            System.out.println("\n\n\t\t\t\1.create an account(1) \n\t\t\t\2.view an account(2) \n\t\t\t\3.delete an account(3) \n\t\t\t\4.edit an account(4)\n\t\t\t\5.search an account(5)\n\t\t\t");
            System.out.println("\n\n\t\t\t if u wanna exit enter 0");
            choice = input.nextInt();

            switch (choice) {
                case 0:
                    exit(0);
                case 1:
                    addCustomer();
                    break;
                case 2:
                    view();
                    break;
                case 3: {
                    System.out.println(" Enter the ID :");
                    int x = input.nextInt();
                    delete(x);
                    break;
                }

                case 4: {
                    System.out.println(" Enter the ID :");
                    int x = input.nextInt();
                    for (int j = 0; j < customers.size(); j++) {


                        if (customers.get(j).getId() == x)

                            edit(j);
                        break;
                    }
                    break;
                }
                case 5: {
                    System.out.println(" Enter the ID:");
                    int x = input.nextInt();
                    search(x);
                    break;
                }


                default: {
                    System.out.println(" wrong number try again:");
                    choice = input.nextInt();

                    switch (choice) {
                        case 0:
                            exit(0);
                        case 1: {
                            addCustomer();
                            break;
                        }
                        case 2: {
                            view();
                            break;
                        }
                        case 3: {
                            System.out.println(" Enter the ID :");
                            int x = input.nextInt();
                            delete(x);
                            break;
                        }

                        case 4: {
                            System.out.println(" Enter the ID :");
                            int x = input.nextInt();
                            for (int j = 0; j < customers.size(); j++) {


                                if (customers.get(j).getId() == x)

                                    edit(j);
                                break;
                            }
                            break;
                        }
                        case 5: {
                            System.out.println(" Enter the ID :");
                            int x = input.nextInt();
                            search(x);
                            break;
                        }

                        default:
                            exit(0);

                    }

                }
            }
        }
    }

    /**
     * Random method for produsing number for the insurance record
     */


    int numofinsu;

    public int numofinsu() {
        Random num = new Random();
        numofinsu = num.nextInt();
        return numofinsu;
    }


    public void addCustomer() {

        System.out.println("enter (T)name & (N)job & (T)type & (T)job place name & (T)address & (N)telephone & (N)fax & (T)email & (N)id");
        Customer c;
        String name = input.next();
        String job = input.next();
        String type = input.next();
        String jobplacename = input.next();
        String address = input.next();
        String telephone = input.next();
        String fax = input.next();
        String email = input.next();
        int id = input.nextInt();


        System.out.println("enter (D)insurance start date & (D)insurance end date & (T)type of vehicle");
        Insurance record = new Insurance();
        String insurancestartdate = input.next();
        String insuranceenddate = input.next();
        String typevehicle = input.next();


        System.out.println("enter  (T)vehicle type & (T)brand & (T)model & (N)vehicle number & (N)card number & (N)driver license number & (N)vehicle price");
        Vehicle item = new Vehicle();
        String typev = input.next();
        String brand = input.next();
        String model = input.next();
        int vehicleno = input.nextInt();
        int cardno = input.nextInt();
        int driverlicenseno = input.nextInt();
        double vprice = input.nextDouble();


        System.out.println("enter (T)accident_description & (D)accident_date (N)total costs");
        String accident_description = input.next();
        String accident_date = input.next();
        double totalcosts = input.nextDouble();

        int x = numofinsu();
        addCustomer(name, job, type, jobplacename, address, telephone, fax, email, id,
                insurancestartdate, insuranceenddate, typevehicle, x,
                typev, brand, model, vehicleno, cardno, driverlicenseno, vprice);


    }


    public void view() {
        for (Customer c : customers) {
            System.out.println(c);

        }
    }


    public Vehicle addVehicle(String vtype, String brand, String model, int vehicleno, int cardno, int driverlicenseno, double vprice) {
        Vehicle v = new Vehicle(vtype, brand, model, vehicleno, cardno, driverlicenseno, vprice);
        return v;

    }

    public Insurance addInsurance(String insurancestartdate, String insuranceenddate, String typevehicle, int numofinsu,
                                  String vtype, String brand, String model, int vehicleno, int cardno, int driverlicenseno, double vprice) {
        Vehicle vehicle = addVehicle(vtype, brand, model, vehicleno, cardno, driverlicenseno, vprice);
        Insurance i = new Insurance(insurancestartdate, insuranceenddate, typevehicle, numofinsu(), vehicle);
        return i;
    }


    public void addCustomer(String name, String job, String type, String jobplacename, String address, String telephone, String fax, String email, int id,
                            String insurancestartdate, String insuranceenddate, String typevehicle, int numofinsu,
                            String vtype, String brand, String model, int vehicleno, int cardno, int driverlicenseno, double vprice) {
        Vehicle v = addVehicle(vtype, brand, model, vehicleno, cardno, driverlicenseno, vprice);
        Insurance i = new Insurance(insurancestartdate, insuranceenddate, typevehicle, numofinsu(), v);

        Customer c = new Customer(name, job, type, jobplacename, address, telephone, fax, email, id, i);
        customers.addFirst(c);

    }


    public boolean edit(int x) {
        System.out.println(customers.get(x).toString());
        System.out.println(" Enter the (T)address & (N)telephone & (N)fax & (T)email  :");
        customers.get(x).setAddress(input.next());
        customers.get(x).setTelephone(input.next());
        customers.get(x).setFax(input.next());
        customers.get(x).setEmail(input.next());

        System.out.println(" the customer info is edited.");
        return true;

    }


    public boolean delete(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                customers.remove(c);
                System.out.println("removing is done");
            }
        }
        return true;
    }


    public void search(int ID) {
        for (Customer o : customers) {
            if (o.getId() == ID)
                view();
        }
    }


    public void addCompensation(){
        System.out.println(" Enter the ID :");
        Scanner A = new Scanner(System.in);
        int x = A.nextInt();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == x) {
                LinkedList<Compensation> compensationdetails = new LinkedList<>();
                Scanner input2 = new Scanner(System.in);
                String accident_description = input2.next();
                String accident_date = input2.next();
                double totalcosts = input2.nextDouble();

                compensationdetails.addFirst(new Compensation(accident_description, accident_date, totalcosts));

                for (Compensation d : compensationdetails) {
                    System.out.println(d);

                }
            }
        }
    }

}



