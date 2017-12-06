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
	 * default constructor
	 * @param isbn isbn of book
	 * @param author author of book
	 * @param title title of book
	 * @param price price of book
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
	
	/**
	 * set isbn of book
	 * @param isbn isbn of book
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * set author of book
	 * @param author author of book
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * set title of book
	 * @param title title of book
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * set price of book
	 * @param price price of book
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * get isbn
	 * @return isbn of book
	 */
	public int getIsbn() {
		return isbn;
	}
	
	/**
	 * get author
	 * @return author of book
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * get title
	 * @return title of book
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * get price
	 * @return price of book
	 */
	public double getPrice(){
		return price;
	}
}
