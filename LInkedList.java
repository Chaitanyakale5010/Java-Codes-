package Rivision;

public class LInkedList {
    Node head;
    class Node
    {
        int data ;
        Node next;

        public Node(int d)
        {
            data=d;
            next = null;
        }
    }
    // Innsert a node at end
    public void insertEnd(int newData)
    {
        Node n = new Node(newData);
        if(head == null)
        {
            head = new Node(newData);
            return ;
        }
        n.next=null;
        Node temp = head ;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = n;
    }
    // Innsert LikedList at First
    public void insertFront(int newData)
    {
        Node n = new Node(newData);
        if(head==null)
        {
            head =n;
            return ;
        }
        n.next=head;
        head=n;
    }
    // insert in between the linkedList
    public void insertInBw(Node prev,int newData)
    {
        Node n = new Node(newData);
        if(head == null)
        {
            System.out.println("You cannot insert a node ....");
            return;
        }
        n.next = prev.next;
        prev.next=n;
    }
    // Display the linked List
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        LInkedList l = new LInkedList();
        l.insertEnd(10);
        l.insertEnd(20);
        l.insertEnd(30);
        l.insertEnd(40);
        l.display();
        l.insertFront(100);
        l.insertFront(200);
        l.insertFront(300);
        l.display();
        l.insertInBw(l.head.next.next.next,555);
        l.insertInBw(l.head.next.next.next.next, 666);
        l.display();
    }
}
