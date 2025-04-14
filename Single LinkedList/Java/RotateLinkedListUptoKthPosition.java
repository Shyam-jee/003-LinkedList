class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
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

    public void rotate(int k)
    {
        if(head==null || head.next==null)
        {
            return;
        }
        int length=1;
        Node temp=head;
        while(temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        k%=length;
        temp.next=head;
        temp=head;
        for(int i=1;i<length-k;i++)
        {
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
    }
}

public class RotateLinkedListUptoKthPosition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1;i<6;i++)
        {
            list.insert_at_end(i);
        }
        System.out.println("LinkedList before rotation ");
        list.print_list();

        list.rotate(3); // k times
        System.out.println("LinkedList after rotation ");
        list.print_list();
    }
}
