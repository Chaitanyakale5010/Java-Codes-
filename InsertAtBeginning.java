 class InsertAtBeginning {
	 Node head;
	class Node
	 {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	 }
	public void insertBegin(int newData)
	{
		Node n = new Node(newData);
		n.next=null;
		if(head==null)
		{
			head=new Node(newData);
			return ;
		}
		n.next=head;
		head = n;	
	}
	public void insertEnd(int newData)
	{
		Node n =new Node(newData);
		// If linked List is empty
		if(head == null)
		{
			head = new Node(newData);
			return ;
		}
		n.next= null;
		Node temp = head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	public void disp()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	 public static void main(String[]args)
	 {
		 InsertAtBeginning i = new InsertAtBeginning();
		 i.insertBegin(10);
		 i.insertBegin(20);
		 i.insertBegin(30);
		 i.disp();
		 System.out.println();
		 i.insertEnd(45);
		 i.insertEnd(55);
		 i.insertEnd(65);
		 i.disp();
		 
	 }
}
