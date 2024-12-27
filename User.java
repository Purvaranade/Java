package GradeProject;

public class User {

	private String userName;
	private int userId;
	private String emailId;
	private String password;
	private Book[] newBooks;
	private Book[] favouriteBooks;
	private Book[] completedBooks;
	public User(String userName, int userId, String emailId, String password) {
		this.userName = userName;
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
		this.newBooks = new Book[10];
		this.favouriteBooks = new Book[10];
		this.completedBooks = new Book[10];
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Book[] getNewBooks() {
		return newBooks;
	}
	public void setNewBooks(Book[] newBooks) {
		this.newBooks = newBooks;
	}
	public Book[] getFavouriteBooks() {
		return favouriteBooks;
	}
	public void setFavouriteBooks(Book[] favouriteBooks) {
		this.favouriteBooks = favouriteBooks;
	}
	public Book[] getCompletedBooks() {
		return completedBooks;
	}
	public void setCompletedBooks(Book[] completedBooks) {
		this.completedBooks = completedBooks;
	}
}
