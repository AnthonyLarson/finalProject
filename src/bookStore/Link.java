package bookStore;

public class Link {
	public String dData; //data item
	public Link next; //next Link
	
	/**
	 * Constructor for link with data item param
	 * @param dData string data item
	 */
	public Link(String dData) {
		super();
		this.dData = dData;
	}
	
	/**
	 * Print out link
	 */
	public void displayLink()
	{
		System.out.println(dData + " ");
	}
}
