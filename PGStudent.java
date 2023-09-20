public class PGStudent extends Student {
    // Additional attributes for PGStudent
    private String rollNo;
    private String specialization;

    // Constructor
    public PGStudent(int aadharId, String name, String address, int phone, String profession,
                     String studentID, String major, int year, int semester, String college, int grade,
                     String rollNo, String specialization) {
        super(aadharId, name, address, phone, profession, studentID, major, year, semester, college, grade);
        this.rollNo = rollNo;
        this.specialization = specialization;
    }

    // Additional method specific to PGStudent
    public void SubmitThesis() {
        System.out.println("PG Student " + getName() + " with Roll No " + rollNo + " is submitting the thesis in " + specialization);
    }
}
