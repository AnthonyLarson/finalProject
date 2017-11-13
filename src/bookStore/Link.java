package bookStore;

public class Link {
	public Book dData; //data item
	public Link next; //next Link
	
	/**
	 * Constructor for link with data item param
	 * @param dData string data item
	 */
	public Link(Book dData) {
		super();
		this.dData = dData;
	}
	
	/**
	 * Print out link
	 */
	public void displayLink()
	{
		System.out.println(dData);
	}
}
