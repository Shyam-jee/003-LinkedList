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
}

public class MergeTwoLinkedList {
    static LinkedList merge(LinkedList list1, LinkedList list2) {
        if (list1.head == null) {
            return list2;
        }
        if (list2.head == null) {
            return list1;
        }

        Node tail = list1.head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = list2.head;

        return list1;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        for(int i=1;i<6;i++)
        {
            list1.insert_at_end(i);
        }
        LinkedList list2 = new LinkedList();
        for(int i=6;i<11;i++)
        {
            list2.insert_at_end(i);
        }
        System.out.println("LinkedList 1 ");
        list1.print_list();

        System.out.println("LinkedList 2 ");
        list2.print_list();
        
        LinkedList mergedList=merge(list1, list2);
        System.out.println("LinkedList 1 after merging ");
        mergedList.print_list();

    }
}
