public class Technician extends Staff {
    // Additional attributes for Technician
    private String techType;

    // Constructor
    public Technician(int aadharId, String name, String address, int phone, String profession,
                      String empID, String empRole, String empDept, float empSalary, int empExperience,
                      String techType) {
        super(aadharId, name, address, phone, profession, empID, empRole, empDept, empSalary, empExperience);
        this.techType = techType;
    }

    // Additional methods specific to Technician
    public String Maintain(String lab) {
        return "Technician " + getName() + " is maintaining the " + lab + " lab.";
    }

    public String Install(String system) {
        return "Technician " + getName() + " is installing the " + system + " system.";
    }
}
