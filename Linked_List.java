package package6;

public class Linked_List {
	Node head;
	static class Node{
		int data;
		Node next;
Node (int d){
	data=d;
	next=null;
			
		}
	}
	public static Linked_List insert(Linked_List List,int data) {
		Node new_node=new Node(data);
		new_node.next=null;
		if(List.head==null) {
			List.head=new_node;
		}
		else {
			Node last=List.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		return List;
	}
	public static void printList(Linked_List list)
	{
		Node currNode = list.head; 
		System.out.print("LinkedList: "); 
		while (currNode != null) { 
			System.out.print(currNode.data + " "); 
			currNode = currNode.next; 
		} 
	} 
	public static void main(String[] args) 
	{ 
		Linked_List list = new Linked_List(); 
 
		list = insert(list, 246); 
		list = insert(list, 123); 
		list = insert(list, 100); 
		list = insert(list, 44); 
		list = insert(list, 15); 
		list = insert(list, 34); 
		list = insert(list, 98); 
		list = insert(list, 67);
        list = insert(list, 90);
		printList(list); 
   }
}
