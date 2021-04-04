/**
 * This class is for the Compensation information (ONLY FOR ACCIDENTS)
 */

/**
 This class contains of - Has A - Relationship.
 */


public class Compensation {

    private String accident_description;
    private String accident_date;
    private double totalcosts;//اجمالي التكاليف
    private double custome_liability = 0.1;//التحمل الاجباري
    private double netCompensation;//صافي التعويض
    private static int accidentno = 0;


    public Compensation() {
        accidentno++;
    }

    public Compensation(String accident_description, String accident_date, double totalcosts) {
        this.accident_description = accident_description;
        this.accident_date = accident_date;
        this.totalcosts = totalcosts;
        accidentno++;
    }

    public String getAccident_description() {
        return accident_description;
    }

    public void setAccident_description(String accident_description) {
        this.accident_description = accident_description;
    }

    public String getAccident_date() {
        return accident_date;
    }

    public void setAccident_date(String accident_date) {
        this.accident_date = accident_date;
    }

    public double getTotalcosts() {
        return totalcosts;
    }

    public void setTotalcosts(double totalcosts) {
        this.totalcosts = totalcosts;
    }

    public double getCustome_liability() {
        return custome_liability;
    }

    public double getNetCompensation() {
        return netCompensation;
    }

    public static int getAccidentno() {
        return accidentno;
    }

    public void NetCompensation() {
        this.netCompensation = totalcosts - custome_liability;
    }

    @Override
    public String toString() {
        return "Compensation{" +
                "accident_description='" + accident_description + '\'' +
                ", accident_date='" + accident_date + '\'' +
                ", totalcosts=" + totalcosts +
                ", custome_liability=" + custome_liability +
                ", netCompensation=" + netCompensation +
                '}';
    }
}