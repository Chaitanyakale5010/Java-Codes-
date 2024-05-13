
public class InsertName {
	Node head;
	class Node
	{
		String name;
		Node next;
		Node(String name)
		{
			this.name=name;
			next = null;
		}
	}
	public void insertEnd(String newName)
	{
		Node n = new Node(newName);
		// If linked List is empty
		if(head == null)
		{
			head = new Node(newName);
			return;
		}
		n.next=null;
		Node temp = head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	// Insert at first
	public void insertFirst(String newName)
	{
		Node n = new Node(newName);
		if(head == null)
		{
			head = n;
		}
		n.next=head;
		head=n;
	}
	// Displaying the linked List
	
	public void disp()
	{
		Node current = head ;
		while(current != null)
		{
			System.out.print(current.name+" ");
			current=current.next;
		}
	}
	public static void main(String[]args)
	{
		InsertName n = new InsertName();
		n.insertEnd("Chaitanya");
		n.insertEnd("Divya");
		n.insertEnd("Amruta");
		n.insertEnd("Satyam");
		n.insertEnd("Omkar");
		n.insertEnd("Jagruti");
		n.disp();
		n.insertFirst("xyz");
		n.disp();
				
	}
}
