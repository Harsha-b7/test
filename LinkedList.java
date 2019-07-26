package package7;

class LinkedList {
node head;
class node{
	int data;
	node next;
	node(int d)
	{
		data=d;
		next=null;
	}
}
public void push(int new_data) 
{ 
    node new_node = new node(new_data); 
    new_node.next = head;   
    head = new_node; 
} 
void deleteNode(int position) 
{ 
    if (head == null) 
        return; 
    node temp = head; 
    if (position == 0) 
    { 
        head = temp.next;  
        return; 
    } 
    for (int i=0; temp!=null && i<position-1; i++) 
        temp = temp.next; 
    if (temp == null || temp.next == null) 
        return; 
    node next = temp.next.next; 
    temp.next = next;  
} 
public void printList() 
{ 
    node tnode = head; 
    while (tnode != null) 
    { 
        System.out.print(tnode.data+" "); 
        tnode = tnode.next; 
    } 
} 
public static void main(String[] args) 
{ 
    LinkedList llist = new LinkedList(); 
    llist.push(50); 
    llist.push(100); 
    llist.push(30); 
    llist.push(28); 
    llist.push(85); 
    System.out.println("\nCreated Linked list is: "); 
    llist.printList(); 
    llist.deleteNode(4);  
    System.out.println("\nLinked List after Deletion at position 4: "); 
    llist.printList(); 
} 
}