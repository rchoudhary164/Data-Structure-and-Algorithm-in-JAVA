package ds.doublyLinkedList.com;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList(){
		this.first = null;
		this.last = null;
	}
	public boolean isEmpty(){
		return first==null;
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			last = newNode;
		}else{
			first.previous = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	
	public int removeFirst(){
		int temp =-1;
		if(!isEmpty()){
			if(first.next ==null){
				last = null;
			}else{
				first.next.previous = null;
			}
			temp = first.data;
			first = first.next;
		}
		return temp;
	}
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(!isEmpty()){
			newNode.previous = last;
			last.next = newNode;
			last = newNode;
		}else{
			newNode.next = first;
			first = newNode;
			last = newNode;
		}
	}
	public void view(){
		Node curNode = first;
		while(curNode !=null){
			curNode.viewNode();
			curNode = curNode.next;
		}
	}
	
}
