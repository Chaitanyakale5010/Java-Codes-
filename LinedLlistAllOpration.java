package iNTERFACE.PracticeSummer31;

public class Masti {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d )
        {
            data= d;
            next = null;
        }
    }
    // Method to insert at begining of the linkedList
    public void insertBegin(int newData)
    {
        Node n = new Node(newData);
        if(head == null)
        {
            head = new Node(newData);
            return;
        }
        n.next = null;
        Node temp = head;
        while(temp.next != null)
        {
            temp=temp.next;
        }
        temp.next = n;
        return;
    }
    // method to isert in Bwteeen 
    public void insertBw(int newData,Node prev_Node)
    {
        Node n = new Node(newData);
        if(prev_Node == null)
        {
            System.out.println("Can't insert data at null position...");
            return;
        }
        n.next = null;
        // Logical part
        n.next = prev_Node.next;
        prev_Node.next = n;
        return;
    }
    // Method to Delete a linedList data
    public void delete(int position)
    {
        Node temp = head;
        if(position == 0)
        {
            head = temp.next;
            return;
        }
        // If the position is in Bw the linkedList
        for(int i=0;i<position-1 && temp.next != null;i++)
        {
            temp=temp.next;
        }
        if(temp==null && temp.next==null)
        {
            return;
        }
        temp.next = temp.next.next;
        return;
    }
    // Method to display the data
    public void show()
    {
        Node temp = head ;
        while(temp !=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Masti m = new Masti();
        m.insertBegin(10);
        m.insertBegin(20);
        m.insertBegin(30);
        m.insertBegin(40);
        m.insertBegin(50);  
        m.show();  
        m.insertBw(25,m.head.next);
        m.insertBw(35,m.head.next.next.next);    
        m.insertBw(45,m.head.next.next.next.next.next);
        m.show();
        m.delete(0);
        m.delete(3);
        m.delete(4);
        m.show();

    }
}
