class Node:
    def __init__(self, data):
        self.data=data;
        self.next=None;
        
class LinkedList:
    def __init__(self):
        self.head=None;
      
    def insertAtEnd(self, data):
        new_node=Node(data);
        if self.head is None:
            self.head=new_node;
            self.head.next=self.head;
            return;  
        temp=self.head;
        while temp.next!=self.head:
            temp=temp.next;
        temp.next=new_node;
        new_node.next=self.head;
        
    def print_list(self):
        if self.head is None:
            print("[]");
            return;
        temp=self.head;
        result=[];
        while True:
            result.append(temp.data)
            temp = temp.next
            if temp == self.head:
                break
        print(result);
        
    def find_mid(self):
        if self.head is None:
            print("List is empty");
            return;
        slow=self.head;
        fast=self.head;
        while fast.next!=self.head and fast.next.next!=self.head:
            slow=slow.next;
            fast=fast.next.next;
        print("mid", slow.data);
        
if __name__=="__main__":
    linked_list=LinkedList();
    for i in range(1, 5):
        linked_list.insertAtEnd(i);
    linked_list.print_list();
    
    linked_list.find_mid();
    