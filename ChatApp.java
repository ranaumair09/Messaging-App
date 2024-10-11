import java.util.Scanner;

public class ChatApp {
    private Sms[][] messageList;
    private Contact[] contacts = new Contact[100];
    private int contactCount = 0;

    public ChatApp() {
        messageList = new Sms[100][100];
        initializeDummyContacts();
    }

    private void initializeDummyContacts() {
        contacts[contactCount++] = new Contact("John", "+4515484841");
        contacts[contactCount++] = new Contact("Smith", "+5548748999");
        contacts[contactCount++] = new Contact("Ramos", "+38974196148");
        contacts[contactCount++] = new Contact("Ali", "+44799491123");
    }

    public void startChat() {
        // Implementation for starting a chat
        System.out.println("Chat started.");
    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new contact");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone number: ");
        String phone = scanner.nextLine();

        contacts[contactCount++] = new Contact(name, phone);
    }

    public void findContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Contact Found: " + contacts[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact Not Found");
        }
    }

    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Delete Contact Menu");
        displayContacts();
        
        System.out.print("Enter the name of the contact you want to delete: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                found = true;
                System.arraycopy(contacts, i + 1, contacts, i, contactCount - i - 1);
                contactCount--;
                System.out.println("Contact Deleted.");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }

    public void displayContacts() {
        for (int i = 0; i < contactCount; i++) {
            System.out.println(contacts[i]);
        }
    }
}
