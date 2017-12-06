package bookStore;

public class BookTester {

	public static void main(String[] args) {
		//Create test objects
		Book bbqForDummies = new Book(108,"Tom Hanks","BBQ For Dummies",19.99);
		Book running = new Book(14,"Tom Cruise","Running and Running",14.99);
		Book programming = new Book(12345,"Anthony Larson","Programming and Stuff",1.99);
		Book driving = new Book(19,"Jason Statham","Driving Fast",19.99);
		Book lifting = new Book(8,"Duane Johnson","Picking up Heavy Things",23.99);
		Book freedom = new Book(987234,"Mel Gibson","Freedom",424.99);
		Book courage = new Book(11,"John Wayne","Courage is being scared to death but saddling up anyway",8.99);
		
		//Build linked list
		LinkedList order = new LinkedList();
		
		//Insert objects into linked list
		order.insertItem(bbqForDummies, 2);
		order.insertItem(running, 1);
		order.insertItem(programming, 1);
		order.insertItem(driving, 1);
		order.insertItem(lifting, 4);
		order.insertItem(freedom, 5);
		order.insertItem(courage, 1);
		
		//Print unsorted list
		System.out.println("Unsorted List");
		order.displayList(order.first);
		
		//Delete first element
		order.deleteFirst();
		
		//sort list
		order.first = order.sort(order.first);
		
		//Print sorted list
		System.out.println("Sorted List");
		order.displayList(order.first);
		
		//Print total cost of orders
		System.out.println("Total Cost: $" + order.getTotalCost(order.first));
	}

}
