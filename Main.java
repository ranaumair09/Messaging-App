import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        ChatApp chatApp = new ChatApp();
        Scanner scanner = new Scanner(System.in);

        System.out.print("---ChatApp---\nEnter 1 to Initialize a chat\nEnter 0 to Exit the Program\nChoice: ");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            chatApp.startChat();
        } else {
            System.out.println("Exiting");
            System.exit(0);
        }

        scanner.close();
    }
}
