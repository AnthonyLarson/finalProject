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
	public void insertLast(Book item, int quantity) //insert item at end of list
	{
		Link newLink = new Link(item); //make new link
		for(int i = 0; i < quantity; i++)
		{
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
	}
	
	/**
	 * delete first item in queue
	 * @return first item in list
	 */
	public Book deleteFirst()
	{
		Book temp = first.dData;
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
	public Book displayFirst()
	{
		return first.dData;
	}
	
	public void deleteItem(Book search, int quantity)
	{
		Link current = first;
		
		for(int i = 0; i < quantity; i++)
		{
			while(current.dData != search)
			{
				if(current.dData == search)
				{
					deleteFirst();
				}
				else
				{
					current = current.next;
				}
			}
		}
	}
}
