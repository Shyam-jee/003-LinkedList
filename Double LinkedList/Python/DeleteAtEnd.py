class Node:
    def __init__(self, data):
        self.data=data;
        self.next=None;
        self.prev=None;
        
class LinkedList:
    def __init__(self):
        self.head=None;
        
    def insertAtEnd(self, data):
        new_node=Node(data);
        if self.head is None:
            self.head=new_node;
            return;
        temp=self.head;
        while temp.next:
            temp=temp.next;
        temp.next=new_node;
        new_node.prev=temp;
        
    def print_list(self):
        if self.head is None:
            print("None");
            return;
        temp=self.head;
        while temp:
            print(temp.data, end=" <--> ")
            temp=temp.next;
        print("None");
        
    def deleteAtEnd(self):
        if self.head is None or self.head.next is None:
            head=None;
            return;
        temp=self.head;
        while temp.next:
            temp=temp.next;
        temp.prev.next=None;
        temp.prev=None;
        
if __name__=="__main__":
    list=LinkedList();
    for _ in range(1, 6):
        list.insertAtEnd(_);
    
    print("LinkedList before deletion")
    list.print_list();
    
    list.deleteAtEnd();
    print("LinkedList after deletion")
    list.print_list();
        