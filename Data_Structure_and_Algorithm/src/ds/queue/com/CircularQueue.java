package ds.queue.com;

public class CircularQueue {
	private int front;
	private int maxsize;
	private int[] queue;
	private int rear;
	private int nitem;
	
	public CircularQueue(int size){
		this.maxsize = size;
		this.queue = new int[maxsize];
		this.front = 0;
		this.rear = -1;
		this.nitem = 0;
	}
	public void insert(int data){
		if(rear == maxsize-1){
			rear = -1;
		}
		rear++;
		queue[rear] = data;
		nitem++;
	}
	public int remove(){
		
		int old_val = queue[front];
		front++;
		if(front == maxsize){
			front=0;
		}
		nitem--;
		return old_val;
	}
	
	public int peakFront(){
		return queue[front];
	}
	public int peakLast(){
		return queue[rear];
	}
	public boolean isEmpty(){
		return(nitem ==0);
	}
	public boolean isFull(){
		System.out.println("nitem "+nitem+" maxsize  " +maxsize);
		return (nitem>=maxsize);
	}
	public int finditems(){
		return nitem;
	}
	public String view(){
		String out = "[";
		
		for(int i=0;i<queue.length;i++){
			out +=queue[i]+" ";
		}
		out +="]";
		System.out.println(out);
		return out;
	}
	public String viewFromFront(){
		String out = "[";
		
		for(int i=front;i<queue.length;i++){
			out +=queue[i]+" ";
		}
		out +="]";
		System.out.println(out);
		return out;
	}

}
