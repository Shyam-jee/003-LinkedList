
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

    public void delete_at_end() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node second_last=head;
        while(second_last.next.next!=null)
        {
            second_last=second_last.next;
        }
        second_last.next=null;
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
public class DeleteAtEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1;i<6;i++)
            list.insert_at_end(i);

        System.out.println("LinkedList before deletion:");
        list.print_list();

        list.delete_at_end();

        System.out.println("LinkedList after deletion:");
        list.print_list();
    }
}
