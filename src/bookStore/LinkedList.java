package bookStore;

public class LinkedList {
	public Link first; //reference to first item
	public Link last; //reference to last item
	
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
	
	/**
	 * insert multiple items at a time into the list
	 * @param item book being added
	 * @param quantity quantity of books being added
	 */
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
	 * Display full linked list
	 * @param firstLink first link in list
	 */
	public void displayList(Link firstLink)
	{
		Link current = firstLink;
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
	public void displayFirst()
	{
		Link current = first;
		current.displayLink();
	}
	
	/**
	 * Sorts the linked list using a merge sort
	 * @param a current link
	 * @return sorted list
	 */
	public Link sort(Link a)
	{		
		if(a == null || a.next == null)
		{
			return a;
		}
		// find middle of list
        Link mid = middle(a);
        Link nextMid = mid.next;
 
        // set node after the middle to null
        mid.next = null;
 
        // sort left list
        Link left = sort(a);
 
        // sort right list
        Link right = sort(nextMid);
 
        //merge lists
        Link sorted = merge(left, right);
        return sorted;
		
	}
	
	/**
	 * Merges linked list
	 * @param b first half of unsorted list
	 * @param c second half of unsorted list
	 * @return return merged list
	 */
	public Link merge(Link b, Link c)
	{
		/**
		 * @param sorted sorted link
		 */
		Link sorted = null; //sorting link
		
		//if link is null return opposite link
		if(b == null)
		{
			return c;
		}
		if(c == null)
		{
			return b;
		}
		
		//compare isbns to sort and place lower value in front
		if(b.dData.getIsbn() <= c.dData.getIsbn())
		{
			sorted = b;
			sorted.next = merge(b.next,c);
		}
		else
		{
			sorted = c;
			sorted.next = merge(b,c.next);
		}
		return sorted; //return sorted link
	}
	
	/**
	 * Find middle element
	 * @param d d represents first link being passed in
	 * @return
	 */
	public Link middle(Link d)
	{
        if (d == null)
        {
            return d; //return if link passed is null
        }
        Link current = d; //initialize current at passed in link
        Link nextCur = d.next; //nextcur is next item in list
        
        //find middle
        while (nextCur != null)
        {
            nextCur = nextCur.next;
            if(nextCur!=null) //iterate
            {
                current = current.next;
                nextCur = nextCur.next;
            }
        }
        return current;
	}
	
	
	/**
	 * Calculate total cost
	 * @param start start of list
	 * @return totalCost of order
	 */
	public double getTotalCost(Link start)
	{
		Link cur = start; //set current to first link
		double totalCost = 0.0; //initialize totalCost at 0
		
		if(start == null) //if start is null return total cost
		{
			return totalCost;
		}
		
		while(cur != null) //add each links price to the total cost until out of links.
		{
			totalCost += cur.dData.getPrice();
			cur = cur.next;
		}
		return totalCost; //return total cost
	}
}
