package ds.queue.com;

public class Queue {
	private int front;
	private int maxsize;
	private int[] queue;
	private int rear;
	private int nitem;

	public Queue(int size){
		this.maxsize = size;
		this.queue = new int[maxsize];
		this.front = 0;
		this.rear = -1;
		this.nitem = 0;
	}
	public void insert(int data){
		if(maxsize-1 !=rear){
			rear ++;
			queue[rear] = data;
			nitem++;
		}else{
			rear = -1;
			System.out.println("queue is full");
		}
	}
	public int remove(){
		if(front < maxsize){
			int temp = queue[front];
			front++;
			nitem--;
		}else{
			System.out.println("queue is empty");
		}
		return queue[front-1];
		
	}
	
	public boolean isEmpty(){
		return (rear == -1);
	}

	public boolean isFull(){
		return (maxsize-1 ==rear);
	}
	
	public String view(){
		String out = "[";
		for(int i=front;i<queue.length;i++){
			out +=queue[i]+" ";
		}
		out +="]";
		return out;
	}

}
