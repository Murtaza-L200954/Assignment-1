public class Student extends Person {
    // Additional attributes for Student
    private String studentID;
    private String major;
    private int year;
    private int semester;
    private String college;
    private int grade;

    // Constructor
    public Student(int aadharId, String name, String address, int phone, String profession,
                   String studentID, String major, int year, int semester, String college, int grade) {
        super(aadharId, name, address, phone, profession);
        this.studentID = studentID;
        this.major = major;
        this.year = year;
        this.semester = semester;
        this.college = college;
        this.grade = grade;
    }

    // Override the abstract methods from the Person class
    @Override
    public String Register(int UID) {
        return "Student " + getName() + " has registered for course with UID " + UID;
    }

    @Override
    public String Perform(String duty) {
        return "Student " + getName() + " is performing " + duty;
    }

    @Override
    public String include(String service) {
        return "Student " + getName() + " is including " + service;
    }

    @Override
    public String like(String item) {
        return "Student " + getName() + " likes " + item;
    }

    // Additional methods specific to Student
    public String Register(String course) {
        return "Student " + getName() + " has registered for the course " + course;
    }

    public int getGrade(String course) {
       
        return grade;
    }

    public String Attend(String className) {
        return "Student " + getName() + " is attending the class " + className;
    }

    public String Learn() {
        return "Student " + getName() + " is learning";
    }
}
