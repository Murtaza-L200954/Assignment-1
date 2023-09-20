public class Staff extends Person {
    // Additional attributes for Staff
    private String empID;
    private String empRole;
    private String empDept;
    private float empSalary;
    private int empExperience;

    // Constructor
    public Staff(int aadharId, String name, String address, int phone, String profession,
                 String empID, String empRole, String empDept, float empSalary, int empExperience) {
        super(aadharId, name, address, phone, profession);
        this.empID = empID;
        this.empRole = empRole;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empExperience = empExperience;
    }

    // Override the abstract methods from the Person class
    @Override
    public String Register(int UID) {
        return "Staff " + getName() + " has registered for course with UID " + UID;
    }

    @Override
    public String Perform(String duty) {
        return "Staff " + getName() + " is performing " + duty;
    }

    @Override
    public String include(String service) {
        return "Staff " + getName() + " is including " + service;
    }

    @Override
    public String like(String item) {
        return "Staff " + getName() + " likes " + item;
    }

    // Additional methods specific to Staff
    public String Attend(String duty) {
        return "Staff " + getName() + " is attending the duty " + duty;
    }

    public String getPromotion() {
       
        if (empExperience >= 5) {
            return "Promotion status: Approved";
        } else {
            return "Promotion status: Pending";
        }
    }

    public float getSalary() {
       
        return empSalary;
    }
}
