

public class Main {
    public static void main(String[] args) {
        // Testing the Person class
        Person person = new Person(123456789, "John Doe", "123 Main St", 1234567890, "Unknown") {
            @Override
            public String Register(int UID) {
                return "Person " + getName() + " has registered with UID " + UID;
            }

            @Override
            public String Perform(String duty) {
                return "Person " + getName() + " is performing " + duty;
            }

            @Override
            public String include(String service) {
                return "Person " + getName() + " is including " + service;
            }

            @Override
            public String like(String item) {
                return "Person " + getName() + " likes " + item;
            }
        };

        System.out.println(person.Register(1001));
        System.out.println(person.Perform("some duty"));
        System.out.println(person.include("some service"));
        System.out.println(person.like("some item"));

        // Testing the Student class
        Student student = new Student(987654321, "Alice Smith", "456 Elm St", 987654321, "Student",
                "S12345", "Computer Science", 2, 1, "ABC College", 85);

        System.out.println(student.Register("Math 101"));
        System.out.println(student.Attend("Math class"));
        System.out.println(student.getGrade("Math 101"));
        System.out.println(student.Learn());

        // Testing the PGStudent class
        PGStudent pgStudent = new PGStudent(111111111, "Bob Johnson", "789 Oak St", 111111111, "PG Student",
                "PG9876", "Biology", 1, 2, "XYZ University", 92, "P12345", "Genetics");

        System.out.println(pgStudent.Register("Advanced Genetics"));
        System.out.println(pgStudent.Attend("Genetics seminar"));
        

        // Testing the Staff class
        Staff staff = new Staff(555555555, "David Williams", "234 Pine St", 555555555, "Staff",
                "E98765", "Admin", "HR", 50000.0f, 3);

        System.out.println(staff.Register(2001));
        System.out.println(staff.Attend("HR meeting"));
        System.out.println(staff.getPromotion());
        System.out.println(staff.getSalary());

        // Testing the Faculty class
        Faculty faculty = new Faculty(444444444, "Eva Davis", "345 Cedar St", 444444444, "Faculty",
                "F12345", "Professor", "Computer Science", 75000.0f, 7,
                "Computer Science", "A", 50, "Ph.D. in Computer Science");

     
        System.out.println(faculty.Teach("Computer Science 101"));
        System.out.println(faculty.Assess("Alice Smith", 95));

        // Testing the Technician class
        Technician technician = new Technician(666666666, "Frank Brown", "567 Birch St", 666666666, "Technician",
                "T98765", "Technical Support", "Lab Maintenance", 40000.0f, 5, "Electronics");

        System.out.println(technician.Register(3001));
        System.out.println(technician.Maintain("Physics Lab"));
        System.out.println(technician.Install("Operating System"));

    }
}
