package bookStore;

public class LinkedList {
	private Link first; //reference to first item
	private Link last; //reference to last item
	
	/**
	 * Default contructor
	 * first set as null
	 * last set as null
	 */
	public LinkedList()
	{
		first = null;
		last = null;
	}
	
	/**
	 * Check if list is empty
	 * @return true or false depending on if list is empty or not
	 */
	public boolean isEmpty()
	{
		return first==null;
	}
	
	/**
	 * insert item at end of queue
	 * @param item data item
	 */
	public void insertLast(String item) //insert item at end of list
	{
		Link newLink = new Link(item); //make new link
		if(isEmpty())
		{
			first = newLink;
		}
		else
		{
			last.next = newLink;
		}
		last = newLink;
	}
	
	/**
	 * delete first item in queue
	 * @return first item in list
	 */
	public String deleteFirst()
	{
		String temp = first.dData;
		if(first.next == null)
		{
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	/**
	 * Display full linked list.
	 */
	public void displayList()
	{
		Link current = first;
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}
	
	/**
	 * display first item in list
	 * @return first item in list
	 */
	public String displayFirst()
	{
		return first.dData;
	}
}
