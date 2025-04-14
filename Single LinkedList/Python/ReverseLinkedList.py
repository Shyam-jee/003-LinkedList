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
        
    def reverse(self):
        if self.head is None or self.head.next is None:
            return;
        temp=None;
        while self.head:
            next=self.head.next;
            self.head.next=temp;
            temp=self.head;
            self.head=next;
        self.head=temp;
        
if __name__=="__main__":
    linked_list=LinkedList();
    for i in range(1, 6):
        linked_list.insert_at_end(i);
        
    print("LinkedList before reversing ");
    linked_list.print_list();
    
    linked_list.reverse();
    print("LinkedList before reversing ");
    linked_list.print_list();