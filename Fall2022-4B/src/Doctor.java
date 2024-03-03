public class Doctor {

    private String name;
    private String id;
    private String hospital;
    private String phone;


    public void setData(String name, String id, String hospital, String phone) {

        this.name = name;
        this.id = id;
        this.hospital = hospital;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void display() {

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hospital: " + hospital);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {

        Doctor doctor = new Doctor(); // create an object of Doctor class
        doctor.setData("John Smith", "D001", "City Hospital", "12345"); // set data for the doctor object
        doctor.display(); // display the data for the doctor object
    }
}