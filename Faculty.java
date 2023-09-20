public class Faculty extends Staff {
    // Additional attributes for Faculty
    private String facultySpecialization;
    private String section;
    private int noOfStudents;
    private String qualification;

    // Constructor
    public Faculty(int aadharId, String name, String address, int phone, String profession,
                   String empID, String empRole, String empDept, float empSalary, int empExperience,
                   String facultySpecialization, String section, int noOfStudents, String qualification) {
        super(aadharId, name, address, phone, profession, empID, empRole, empDept, empSalary, empExperience);
        this.facultySpecialization = facultySpecialization;
        this.section = section;
        this.noOfStudents = noOfStudents;
        this.qualification = qualification;
    }

    // Additional methods specific to Faculty
    public String Teach(String course) {
        return "Faculty " + getName() + " is teaching the course " + course;
    }

    public String Assess(String student, int grade) {
        return "Faculty " + getName() + " is assessing " + student + "'s grade as " + grade;
    }
}
