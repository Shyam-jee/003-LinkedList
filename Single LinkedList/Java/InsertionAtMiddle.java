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

    public void insert_at_middle(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node new_node=new Node(data);
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        new_node.next=slow.next;
        slow.next=new_node;
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

public class InsertionAtMiddle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1;i<3;i++)
            list.insert_at_end(i);

        System.out.println("LinkedList before insertion:");
        list.print_list();

        list.insert_at_middle(6);

        System.out.println("LinkedList after insertion:");
        list.print_list();
    }
}
