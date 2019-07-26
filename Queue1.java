package package5;

class Queue1 {
	int Queue[]=new int[4];
	int frontEnd=0;
	int rearEnd=0;
	public void Enqueue(int element) {
		Queue[frontEnd]=element;
		frontEnd++;
		System.out.println("Enqueue:" +element);		
	}
	public void Dequeue() {
		int element1;
		element1=Queue[rearEnd];
		rearEnd++;
		System.out.println("Dequeue:" +element1);
	}
		public static void main(String[] args) {
			Queue1 q=new Queue1();
		q.Enqueue(30);
		q.Enqueue(50);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Dequeue();
	   }

}
