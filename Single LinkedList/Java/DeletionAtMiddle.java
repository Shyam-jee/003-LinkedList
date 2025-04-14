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

    public void delete_at_middle() {
        if (head == null || head.next==null) {
            head=null;
            return;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=slow.next.next;
    }

    public void print_list() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class DeletionAtMiddle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1;i<6;i++)
            list.insert_at_end(i);

        System.out.println("LinkedList before deletion:");
        list.print_list();

        list.delete_at_middle();

        System.out.println("LinkedList after deletion:");
        list.print_list();
    }
}
