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
    
    def delete_at_middle(self):
        if self.head is None or self.head.next is None:
            self.head=None;
            return;
        slow=self.head;
        fast=self.head.next;
        while fast and fast.next and fast.next.next:
            slow=slow.next;
            fast=fast.next.next;
        
        slow.next=slow.next.next;
        
    def print_list(self):
        current_node=self.head;
        while current_node:
            print(current_node.data, end=" -> ");
            current_node=current_node.next;
        print("None");
        
if __name__=="__main__":
    linked_list=LinkedList();
    for i in range(1, 6):
        linked_list.insert_at_end(i);
    print("LinkedList before deletion ");
    linked_list.print_list();
    
    linked_list.delete_at_middle();
    print("LinkedList after deletion ");
    linked_list.print_list();
        