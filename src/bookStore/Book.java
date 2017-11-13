package bookStore;

public class Book {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", title=" + title + ", price=" + price + "]";
	}

	/**
	 * @param isbn
	 * @param author
	 * @param title
	 * @param price
	 */
	public Book(int isbn, String author, String title, double price) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	private int isbn;
	private String author;
	private String title;
	private double price;
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice(){
		return price;
	}
}
