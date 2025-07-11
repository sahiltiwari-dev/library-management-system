import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Show All Books");
            System.out.println("4. Show All Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();
                    library.addMember(new Member(memberId, name));
                    break;

                case 3:
                    library.showBooks();
                    break;

                case 4:
                    library.showMembers();
                    break;

                case 5:
                    System.out.print("Enter Member ID: ");
                    String memId = sc.nextLine();
                    if (!library.isMemberRegistered(memId)) {
                        System.out.println("Member not registered. Kindly register to borrow books.");
                        break;
                    }
                    System.out.print("Enter Book ID: ");
                    String bId = sc.nextLine();
                    library.borrowBook(memId, bId);
                    break;

                case 6:
                    System.out.print("Enter Member ID: ");
                    String memId2 = sc.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bId2 = sc.nextLine();
                    library.returnBook(memId2, bId2);
                    break;

                case 0:
                    System.out.println("Exiting Library System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
