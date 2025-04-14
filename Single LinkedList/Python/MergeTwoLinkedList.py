class Node:
    def __init__(self, data):
        self.data=data;
        self.next=None;

class LinkedList:
    def __init__(self):
        self.head=None;
        
    def insert_at_end(self, data):
        new_node=Node(data);
        if self.head is None:
            self.head=new_node;
            return;
        last_node=self.head;
        while last_node.next:
            last_node=last_node.next;
        last_node.next=new_node;
    
    def print_list(self):
        current_node=self.head;
        while current_node:
            print(current_node.data, end=" -> ");
            current_node=current_node.next;
        print("None");
        
    def merge(self, head2):
        if self.head is None:
            self.head=head2.head;
        
        tail=self.head;
        while tail.next:
            tail=tail.next;
        tail.next=head2.head;
        
if __name__=="__main__":
    linked_list1=LinkedList();
    linked_list2=LinkedList();
    for i in range(1, 6):
        linked_list1.insert_at_end(i);
        
    for i in range(6, 11):
        linked_list2.insert_at_end(i);
        
    print("LinkedList 1 ");
    linked_list1.print_list();
    
    print("LinkedList 2 ");
    linked_list2.print_list();
    
    linked_list1.merge(linked_list2);
    
    print("LinkedList 1 after merging ");
    linked_list1.print_list();