public class Contact {
    private String name;
    private String phoneNumber;
    private String id;
    public static int contactIdCounter = 0;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = String.format("%03d", contactIdCounter++);
    }

    @Override
    public String toString() {
        return String.format("{ID: %s | Name: %s | Phone: %s}", id, name, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
