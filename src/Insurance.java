/**
 * This class is for the Insurance information
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 This class contains of - Has A - Relationship, it also contains Arthimatic opreations.
 */

public class Insurance {

    private String insurancestartdate;
    private String insuranceenddate;
    private double insurance_instalment; //القسط السنوي الكلي
    private static double medical_expenses = 100000;//مصاريف طبية
    private static double pull_protect = 50000; //مصاريف سحب وحماية
    private int numofinsu; //رقم وثيقة التامين
    private String typevehicle;//نوع المؤمن عليه
    //private int numvehicle=0;//عدد المؤمن عليه

    private LinkedList<Vehicle> item = new LinkedList<>();


    public Insurance(String insurancestartdate, String insuranceenddate, String typevehicle, int numofinsu, Vehicle vehicle) {
        this.insurancestartdate = insurancestartdate;
        this.insuranceenddate = insuranceenddate;
        this.numofinsu = numofinsu;
        this.typevehicle = typevehicle;
        item.addFirst(vehicle);
    }

    public Insurance() {

    }

    public double insurance_instalment() {
        double total = 0;
        for (int i = 0; i < item.size(); i++) {
            total += item.get(i).getInstalment();
        }
        return total;
    }

    public String getInsurancestartdate() {
        return insurancestartdate;
    }

    public void setInsurancestartdate(String insurancestartdate) {
        this.insurancestartdate = insurancestartdate;
    }

    public String getInsuranceenddate() {
        return insuranceenddate;
    }

    public void setInsuranceenddate(String insuranceenddate) {
        this.insuranceenddate = insuranceenddate;
    }

    public double getInsurance_instalment() {
        return insurance_instalment;
    }


    public String getTypevehicle() {
        return typevehicle;
    }

    public void setTypevehicle(String typevehicle) {
        this.typevehicle = typevehicle;
    }

    public double getMedical_expenses() {
        return medical_expenses;
    }

    public double getPull_protect() {
        return pull_protect;
    }

    public int getNumofinsu() {
        return numofinsu;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insurancestartdate='" + insurancestartdate + '\'' +
                ", insuranceenddate='" + insuranceenddate + '\'' +
                ", insurance_instalment=" + insurance_instalment +
                ", medical_expenses=" + medical_expenses +
                ", pull_protect=" + pull_protect +
                ", numofinsu=" + numofinsu +
                ", typevehicle='" + typevehicle + '\'' +
                ", item=" + item +
                '}';
    }
}