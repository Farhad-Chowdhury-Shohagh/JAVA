import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book[] books = new Book[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    books[count] = new Book();

                    System.out.print("Enter book ID: ");
                    books[count].id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter book title: ");
                    books[count].title = input.nextLine();

                    System.out.print("Enter author name: ");
                    books[count].author = input.nextLine();

                    count++;
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Book List ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + books[i].id);
                        System.out.println("Title: " + books[i].title);
                        System.out.println("Author: " + books[i].author);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter book ID to search: ");
                    int searchId = input.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].id == searchId) {
                            System.out.println("Book Found!");
                            System.out.println("Title: " + books[i].title);
                            System.out.println("Author: " + books[i].author);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found!");
                    break;

                case 4:
                    System.out.println("Exiting library system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        input.close();
    }
}
