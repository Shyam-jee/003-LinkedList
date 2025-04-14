class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}

class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }

    public void insertAtEnd(int data){
        Node new_node=new Node(data);
        if(head==null)
        {
            head=new_node;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
    }

    public void print_list(){
        if(head==null)
        {
            System.out.println("null");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" <--> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void deleteAtEnd()
    {
        if(head==null || head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.prev.next=null;
        temp.prev=null;
    }
}

public class DeletionAtEnd{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        for(int i=1;i<6;i++)
        {
            list.insertAtEnd(i);
        }
        System.out.println("LinkedList before deletion ");
        list.print_list();

        list.deleteAtEnd();
        System.out.println("LinkedList after deletion ");
        list.print_list();
    }
}