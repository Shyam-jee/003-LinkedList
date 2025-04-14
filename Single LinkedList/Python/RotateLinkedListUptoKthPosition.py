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
        
    def rotate(self, k):
        if self.head is None or self.head.next is None or k==0:
            return;
        
        length=1;
        temp=self.head;
        while temp.next:
            length=length+1;
            temp=temp.next;
            
        k=k%length;
        if k==0:
            return;
        temp.next=self.head;
        temp=self.head;
        for _ in range(0, length-k-1):
            temp=temp.next;
            
        self.head=temp.next;
        temp.next=None;
        
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
    print("LinkedList before rotation ");
    linked_list.print_list();
        
    linked_list.rotate(3);
    print("LinkedList after rotation ");
    linked_list.print_list();
   