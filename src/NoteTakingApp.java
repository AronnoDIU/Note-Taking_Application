import java.util.ArrayList;
import java.util.Scanner;

public class NoteTakingApp {
    // ArrayList to store the notes entered by the user
    private static final ArrayList<String> notes = new ArrayList<>();
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int choice; // To store the choice entered by the user

        do {
            System.out.println("Note Taking App");
            System.out.println("1. Add Note");
            System.out.println("2. Edit Note");
            System.out.println("3. Delete Note");
            System.out.println("4. View Notes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = userInput.nextInt(); // Read the choice entered by the user
            userInput.nextLine(); // Consume the newline character

            switch (choice) {
                case 1: // For Add Note
                    addNote();
                    break;
                case 2: // For Edit Note
                    editNote();
                    break;
                case 3: // For Delete Note
                    deleteNote();
                    break;
                case 4: // For View Notes
                    viewNotes();
                    break;
                case 5: // For Exit
                    System.out.println("Exiting Note Taking App. Goodbye!");
                    break;
                default: // For Invalid Choice
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5); // Repeat the loop until the user enters 5 to exit
    }

    // Method to add a note
    private static void addNote() {
        System.out.print("Enter your note: ");
        String note = userInput.nextLine();

        notes.add(note); // Add the note to the ArrayList
        System.out.println("Note added successfully!");
    }

    // Method to edit a note
    private static void editNote() {
        // Check if there are any notes available to edit
        if (notes.isEmpty()) {
            System.out.println("No notes available to edit.");
            return;
        }

        viewNotes(); // Display the notes available to the user

        System.out.print("Enter the index of the note you want to edit: ");
        int index = userInput.nextInt();
        userInput.nextLine(); // Consume the newline character

        // Check if the index entered by the user is valid
        if (index >= 0 && index < notes.size()) {
            System.out.print("Enter the new content for the note: ");
            String newContent = userInput.nextLine();

            notes.set(index, newContent); // Update the note at the given index
            System.out.println("Note edited successfully!");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    // Method to delete a note from the ArrayList
    private static void deleteNote() {
        // Check if there are any notes available to delete
        if (notes.isEmpty()) {
            System.out.println("No notes available to delete.");
            return;
        }

        viewNotes(); // Display the notes available to the user

        System.out.print("Enter the index of the note you want to delete: ");
        int index = userInput.nextInt();
        userInput.nextLine(); // Consume the newline character

        // Check if the index entered by the user is valid
        if (index >= 0 && index < notes.size()) {
            notes.remove(index); // Delete the note at the given index
            System.out.println("Note deleted successfully!");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    // Method to view the notes
    private static void viewNotes() {
        // Check if there are any notes available to view
        if (notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            System.out.println("Your Notes:");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println(i + ". " + notes.get(i));
            }
        }
    }
}