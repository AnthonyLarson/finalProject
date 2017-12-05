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
	public void insertLast(Book item) //insert item at end of list
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
	
	public void insertItem(Book item, int quantity)
	{
		for(int i = 0; i < quantity; i++)
		{
			insertLast(item);
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
	
	public Link sort(Link a)
	{		
		if(a == null || a.next == null)
		{
			return a;
		}
		// get the middle of the list
        Link mid = middle(a);
        Link nextMid = mid.next;
 
        // set the next of middle node to null
        mid.next = null;
 
        // Apply mergeSort on left list
        Link left = sort(a);
 
        // Apply mergeSort on right list
        Link right = sort(nextMid);
 
        // Merge the left and right lists
        Link sorted = merge(left, right);
        return sorted;
		
	}
	
	public Link merge(Link b, Link c)
	{
		Link sorted = null;
		
		//if link is null return opposite link
		if(b == null)
		{
			return c;
		}
		if(c == null)
		{
			return b;
		}
		
		if(b.dData.getIsbn() <= c.dData.getIsbn())
		{
			sorted = b;
			sorted = merge(b.next,c);
		}
		else
		{
			sorted = c;
			sorted = merge(b,c.next);
		}
		return sorted;
	}
	
	public Link middle(Link d)
	{
        if (d == null)
        {
            return d;
        }
        Link current = d;
        Link nextCur = d.next;
        
        //find middle
        while (nextCur != null)
        {
            nextCur = nextCur.next;
            if(nextCur!=null)
            {
                current = current.next;
                nextCur=nextCur.next;
            }
        }
        return current;
	}
}
