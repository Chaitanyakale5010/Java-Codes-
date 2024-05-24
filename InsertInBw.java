
public class InsertInBw {
	Node  head;
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
	public void insertEnd(int newData)
	{
		Node n = new Node(newData);
		if(head==null)
		{
			head=new Node(newData);
			return;
		}
		n.next=null;
		Node temp=head;
		while(temp.next != null)
		{
			temp=temp.next;		
		}
		temp.next=n;
	}
	public void insertBw(Node prev_Node,int newData)
	{
		if(prev_Node==null)
		{
			System.out.println("The previous node cannot contail null value..");
			return ;
		}
		
		Node n = new Node(newData);
		n.next=prev_Node.next;
		prev_Node.next=n;
	}
	public void disp()
	{
		Node temp = head;
		while(temp !=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[]args)
	{
		InsertInBw i = new InsertInBw();
		i.insertEnd(10);
		i.insertEnd(20);
		i.insertEnd(30);
		i.insertEnd(40);
		i.disp();
		i.insertBw(i.head.next.next.next,25);
		i.disp();
	}
}
