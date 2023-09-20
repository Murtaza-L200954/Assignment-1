public abstract class Person {
    // Attributes
    private int aadharId;
    private String name;
    private String address;
    private int phone;
    private String profession;

    // Constructor
    public Person(int aadharId, String name, String address, int phone, String profession) {
        this.aadharId = aadharId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.profession = profession;
    }
    
     public String getName() {
        return name;
    }

    // Abstract methods
    public abstract String Register(int UID);

    public abstract String Perform(String duty);

    public abstract String include(String service);

    public abstract String like(String item);
}