//import java.sql.*;
//
///**
// * This class is for connecting the program with the data base
// */
//
//
//public class Database {
//     Connection con;
//    PreparedStatement stmt;
//    public void addCustomer(String name, String job, String type, String jobplacename, String address, String telephone, String fax, String email, int id) {
//        try {
//            stmt = con.prepareStatement("insert into Customer values ("+id+" ,'"+name+"' ,'"+job+"' ,'"+jobplacename+"','"+address+"',"+fax+" ,"+telephone+","+email+")");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//    public void addInsurance (String insurancestartdate, String insuranceenddate, String typevehicle, int numofinsu,
//                                 String vtype, String brand, String model, int vehicleno, int cardno, int driverlicenseno, double vprice)
//    {
//        try {
//            stmt = con.prepareStatement("insert into Insurance ("+numofinsu+",'"+insurancestartdate+"','"+insuranceenddate+"','"+typevehicle+"')");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    public void addVehicle (String vtype, String brand, String model, int vehicleno, int cardno, int driverlicenseno, double vprice)
//    {
//        try {
//            stmt = con.prepareStatement("insert into Vehicle ('"+vtype+"','"+brand+"','"+model+"',"+vehicleno+","+cardno+","+driverlicenseno+","+vprice+")");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    public void addCompensation(String accident_description, String accident_date, double totalcosts) {
//
//        {
//        try {
//            stmt = con.prepareStatement("insert into Compensation ('"+accident_description+"','"+accident_date+"',"+totalcosts+")");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }}
//    public void delete (String name, String job, String type, String jobplacename, String address, String telephone, String fax, String email, int id) {
//
//        try {
//            stmt = con.prepareStatement("delete from customer  where (id ==id)");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void edit(String name, String job, String type, String jobplacename, String address, String telephone, String fax, String email, int id) {
//
//        try {
//            stmt = con.prepareStatement("update customer  set (job,type,jobplacename,telephone,fax,email)  where(id ==id)");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void search(String name, String job, String type, String jobplacename, String address, String telephone, String fax, String email, int id) {
//
//        try {
//            stmt = con.prepareStatement("select * from Customer where (id ==id)");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void view_Customer(String name, String job, String type, String jobplacename, String address, String telephone, String fax, String email, int id) {
//
//        try {
//            stmt = con.prepareStatement("select * from Customer where (id ==id)");
//            stmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//        public void connectToDB() {
//        try {
//             con = DriverManager.getConnection("jdbc:ucanaccess://F:\\code.accdb");
//
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from Customer");
//            while (rs.next())
//                System.out.println(rs.getInt("Customer_ID") + " " + rs.getString("Customer_name") + " " + rs.getString("Customer_Job") + " " + rs.getString("Customer_Address") + " " + rs.getString("Customer_fax") + " " + rs.getInt("Customer_phone") + " " + rs.getString("Customer_Email") + " " + rs.getInt("Insurane_number"));
//
//
//            ResultSet rs2 = stmt.executeQuery("select * from Insurane");
//            while (rs2.next())
//                System.out.println(rs2.getInt("Insurane_number") + " " + rs2.getString("Insurane_Speriod") + " " + rs2.getString("Insurane_Eperiod") + " " + rs2.getString("Insurane_type") + " " + rs2.getInt("Insurane_num") + " " + rs2.getInt("Insurane_annual") + " " + rs2.getInt("Insurane_ppexpenses") + " " + rs2.getInt("Custmoer_ID"));
//
//
//            ResultSet rs3 = stmt.executeQuery("select * from Vehicle");
//            while (rs3.next())
//                System.out.println(rs3.getInt("Vehicle_plata") + " " + rs3.getInt("Vehicle_Card") + " " + rs3.getInt("Vehicle_Driver") + " " + rs3.getInt("Vehicle_Value") + " " + rs3.getString("Vehicle_type") + " " + rs3.getString("Vehicle_Brand") + " " + rs3.getString("Vehicle_Model") + " " + rs3.getInt("Vehicle_Iprice") + " " + rs3.getInt("Vehicle_ANNALPREMIUM") + " " + rs3.getInt("Insurane_number"));
//
//
//            ResultSet rs4 = stmt.executeQuery("select * from Employee");
//            while (rs4.next())
//                System.out.println(rs4.getString("E_username") + " " + rs4.getInt("E_password") + " " + rs4.getString("E_name") + " " + rs4.getInt("E_phone") + " " + rs4.getString("E_email"));
//
//
//            ResultSet rs5 = stmt.executeQuery("select * from Compensation");
//            while (rs5.next())
//                System.out.println(rs5.getInt("Comp_numofaccident") + " " + rs5.getInt("Comp_accDate") + " " + rs5.getString("Comp_accDetails") + " " + rs5.getInt("Comp_Totalcosts") + " " + rs5.getInt("Comp_comend") + " " + rs5.getInt("Comp_netcomp") + " " + rs5.getInt("Vehicle_plata") );
//
//
//            con.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
