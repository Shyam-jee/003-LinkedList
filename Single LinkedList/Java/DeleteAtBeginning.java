class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteAtBeginning {

    Node head;
    public DeleteAtBeginning() {
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

    public void delete_at_beginning() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void print_list() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteAtBeginning list = new DeleteAtBeginning();
        for(int i=1;i<6;i++)
            list.insert_at_end(i);

        System.out.println("LinkedList before deletion:");
        list.print_list();

        list.delete_at_beginning();

        System.out.println("LinkedList after deletion:");
        list.print_list();
    }
}