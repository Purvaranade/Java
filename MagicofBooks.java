package GradeProject;
import java.util.Scanner;
public class MagicofBooks {
	private static User user;
	private static Book book1;
	private static Book book2;
	private static Scanner scanner;

	public static void main(String[] args) {
		user = new User("John Doe", 1, "johndoe@example.com", "pass123");
		book1 = new Book("Book 1", "Author 1","Description 1",1);
		book2 = new Book("Book 2", "Author 2", "Description 2",2);
		user.getNewBooks()[0] = book1;
		user.getFavouriteBooks()[0] = book2;
		user.getCompletedBooks()[0] = book1;
		user.getCompletedBooks()[0] = book2;
		scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Magic of Books Menu:");
			System.out.println("1.Login");
			System.out.println("2.View New Books");
			System.out.println("3.View Favourite Books");
			System.out.println("4.View Completed Books");
			System.out.println("5.Search Book by Id");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				login(user, scanner);
				break;
			case 2:
				viewNewBooks(user);
				break;
			case 3:
				viewFavouriteBooks(user);
				break;
			case 4:
				viewCompletedBooks(user);
				break;
			case 5:
				searchBookById(user,scanner);
				break;
			case 6:
				System.out.println("Exit");
				return;
				default:
					System.out.println("Invalid choice.");
			}
		}

	}
	private static void searchBookById(User user2, Scanner scanner2) {
		
		
	}
	private static void viewCompletedBooks(User user2) {
		
		
	}
	private static void viewFavouriteBooks(User user2) {
		
	}
	private static void viewNewBooks(User user2) {
		
		
	}
	private static void login(User user , Scanner scanner) {
		System.out.print("Enter username: ");
		String username = scanner.next();
		System.out.print("Enter password: ");
	}

}
