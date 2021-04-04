

/**
 * This class is for the Vehicle information, contains of only one Vehicle info.
 * This class contains of - Has A - Relationship.
 */

import java.util.LinkedList;

public class Vehicle {

    private String type;
    private String brand;
    private String model;
    private int vehicleno;
    private int cardno;
    private int driverlicenseno;
    private double vprice;//قيمة المؤمن عليه
    private static double rate = 0.1;//نسبة التامين على قيمة المؤمن عليه(سعر التامين)
    private double instalment;//القسط السنوي للمؤمن عليه
    private LinkedList<Compensation> accident = new LinkedList<>();


    public Vehicle(String type, String brand, String model, int vehicleno, int cardno, int driverlicenseno, double vprice) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.vehicleno = vehicleno;
        this.cardno = cardno;
        this.driverlicenseno = driverlicenseno;
        this.vprice = vprice;
    }

    public Vehicle() {

    }


    public double getRate() {
        return rate;
    }

    public double getInstalment() {
        return instalment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(int vehicleno) {
        this.vehicleno = vehicleno;
    }

    public int getCardno() {
        return cardno;
    }

    public void setCardno(int cardno) {
        this.cardno = cardno;
    }

    public int getDriverlicenseno() {
        return driverlicenseno;
    }

    public void setDriverlicenseno(int driverlicenseno) {
        this.driverlicenseno = driverlicenseno;
    }

    public double getVprice() {
        return vprice;
    }

    public void setVprice(double vprice) {
        this.vprice = vprice;
    }

    public LinkedList<Compensation> getAccident() {
        return accident;
    }

    public void setAccident(LinkedList<Compensation> accident) {
        this.accident = accident;
    }

    public double Instalment() {
        instalment = vprice * rate;
        return instalment;
    }

    public void addCompensation() {
        accident = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vehicleno=" + vehicleno +
                ", cardno=" + cardno +
                ", driverlicenseno=" + driverlicenseno +
                ", vprice=" + vprice +
                ", rate=" + rate +
                ", instalment=" + instalment +
                ", accident=" + accident +
                '}';
    }
}

