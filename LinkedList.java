class LinkedList
{
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
}
public static void main(String args[])
{
    LinkedList ll=new LinkedList();
    
    ll.head = new node(1);
    Node second=new Node(2);
    Node third=new Node(3);
    
    ll.head.next=second;
    second.next=third;
    
}