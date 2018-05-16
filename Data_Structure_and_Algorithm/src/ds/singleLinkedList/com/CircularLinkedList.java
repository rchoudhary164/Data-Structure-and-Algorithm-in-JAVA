package ds.singleLinkedList.com;

public class CircularLinkedList {
	private Node first;
	private Node last;
	public boolean isEmpty(){
		return (first==null);
	}
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		if(isEmpty()){
			last = newNode;
		}
		first = newNode;
	}
	public int removeFirst(){
		int temp = -1;
		if(!isEmpty() && first.next ==null){
			last = null;
		}
		if(!isEmpty()){
			temp = first.data;
			first = first.next;
			return temp;
		}
		return temp;
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			first = newNode;
			last = newNode;
		}else{
			last.next = newNode;
			last = newNode;
		}
	}
	public void insertAfter(int after,int data){
		Node newNode = new Node();
		newNode.data = data;
		if(!isEmpty()){
			Node curNode = first;
			while(curNode !=null){
				if(curNode.data ==after) break;
				curNode = curNode.next;
			}
			if(curNode !=null){
				Node temp = curNode.next;
				curNode.next = newNode;
				newNode.next = temp;
			}
		}else{
			System.out.println("Linked List is empty");
			newNode.next = first;
			first = newNode;
			last = newNode;
		}
		
	}
	public String view(){
		String out = "[";
		Node curNode =first;
		while(curNode !=null){
			out +=curNode.data+" ";
			curNode = curNode.next;
		}
		out +="]";
		System.out.println(out);
		return out;
	}
}
