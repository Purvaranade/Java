package GradeProject;

public class Book {

	private String bookName;
	private String authorName;
	private String description;
	private int bookId;
	public Book(String bookName, String authorName, String description, int bookId) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	

}
