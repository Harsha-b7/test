package package3;

public class Stack {
int Stack[]=new int[4];
int current_position=0;
public void push(int element) {
	Stack[current_position]=element;
	current_position++;
	System.out.println("push value:" +element);		
}
public void pop() {
	current_position--;
	int element=Stack[current_position];
	System.out.println("pop value:" +element);
    }
public static void main(String[] args) {
	Stack s=new Stack();
	s.push(20);
	s.push(50);
	s.push(10);
	s.push(40);
	s.pop();
   }
}
	

