/**
 * This class is for the Customer information.
 * the first class which is executed after checking the username and the pw.
 * This class contains of - Has A - Relationship.
 */

public class Customer {
    private String name;
    private String job;
    private String type;
    private String jobplacename;
    private String address;
    private String telephone;
    private String fax;
    private String email;
    private int id;
    private Insurance record = new Insurance();

    public Customer(String name, String job, String type, String jobplacename, String address, String telephone, String fax, String email, int id, Insurance record) {
        this.name = name;
        this.job = job;
        this.type = type;
        this.jobplacename = jobplacename;
        this.address = address;
        this.telephone = telephone;
        this.fax = fax;
        this.email = email;
        this.id = id;
        this.record = record;
    }


    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getType() {
        return type;
    }

    public void setType(String typee) {
        this.type = type;
    }

    public String getJobplacename() {
        return jobplacename;
    }

    public void setJobplacename(String jobplacename) {
        this.jobplacename = jobplacename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Insurance getRecord() {
        return record;
    }

    public void setRecord(Insurance record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", type='" + type + '\'' +
                ", jobplacename='" + jobplacename + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", record=" + record +
                '}';
    }
}
