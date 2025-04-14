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

    public void insert_at_beginning(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
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

public class InsertAtBeginning {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1;i<6;i++)
            list.insert_at_end(i);

        System.out.println("LinkedList before insertion:");
        list.print_list();

        list.insert_at_beginning(6);

        System.out.println("LinkedList after insertion:");
        list.print_list();
    }
}
