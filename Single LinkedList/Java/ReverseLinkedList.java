class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    public LinkedList() {
        head = null;
    }

    public void insert_at_end(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public void print_list() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        if(head==null || head.next==null) 
        {
            return;
        }
        Node temp=null;
        while(head!=null)
        {
            Node next=head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        head=temp;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1;i<6;i++)
        {
            list.insert_at_end(i);
        }
        System.out.println("LinkedList before reversing ");
        list.print_list();

        list.reverse();
        System.out.println("LinkedList after reversing ");
        list.print_list();
    }
}
