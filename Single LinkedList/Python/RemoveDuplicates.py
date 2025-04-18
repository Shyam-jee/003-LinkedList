# remove duplicates from an unsorted single linkedlist in O(1) auxiliary space.

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
        
    def removeDuplicates(self):
        if self.head is None or self.head.next is None:
            return;
        curr=self.head.next;
        while curr:
            temp=curr;
            while temp.next:
                if temp.next.data==curr.data:
                    temp.next=temp.next.next;
                else:
                    temp=temp.next;
            curr=curr.next;
    
    def print_list(self):
        current_node=self.head;
        while current_node:
            print(current_node.data, end=" -> ");
            current_node=current_node.next;
        print("None");
        
if __name__=="__main__":
    linked_list = LinkedList()
    # Example input with duplicates
    for i in [1, 2, 3, 2, 4, 5, 3, 1]:
        linked_list.insert_at_end(i)
    
    print("Original List:")
    linked_list.print_list()
    
    linked_list.removeDuplicates()
    
    print("List after removing duplicates:")
    linked_list.print_list()
        