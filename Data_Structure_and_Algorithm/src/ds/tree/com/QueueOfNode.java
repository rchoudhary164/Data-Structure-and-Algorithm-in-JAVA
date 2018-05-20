package ds.tree.com;

import ds.queue.com.Queue;

public class QueueOfNode {
	private Node[] queue;
	private int maxsize;
	private int front;
	private int rear;
	
	public QueueOfNode(int size){
		this.maxsize = size;
		this.queue = new Node[maxsize];
		this.front = 0;
		this.rear = -1;
	}
	public void insert(Node node){
		if(maxsize-1 !=rear){
			rear++;
			queue[rear] = node;
		}else{
			rear = -1;
			System.out.println("Queue is full");
		}
	}
	public Node remove(){
		if(front !=maxsize-1){
			front++;
			return queue[front];
		}else{
			System.out.println("queue is empty");
			return null;
		}
	}
	public void view(){
		System.out.println("front "+front+" rear "+rear);
		while(front<=rear){
			System.out.println("{"+queue[front].key+"}");
			front++;
		}
	}
}
