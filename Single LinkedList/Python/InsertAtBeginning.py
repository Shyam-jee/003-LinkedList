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
    
    def insert_at_beginning(self, data):
        if self.head is None:
            self.head=Node(data);
            return;
        new_node=Node(data);
        new_node.next=self.head;
        self.head=new_node;
        
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
    print("LinkedList before insertion ");
    linked_list.print_list();
    
    linked_list.insert_at_beginning(6);
    print("LinkedList after insertion ");
    linked_list.print_list();
        