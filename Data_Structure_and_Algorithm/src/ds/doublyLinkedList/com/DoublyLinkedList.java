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
		}else{
			newNode.next = first;
			first = newNode;
		}
		last = newNode;
	}
	public int removeLast(){
		int temp = -1;
		if(!isEmpty()){
			if(last.previous ==null){
				last = null;
				first = null;
			}else{
				temp = last.data;
				last = last.previous;
				last.next = null;
			}
		}
		return temp;
	}
	public boolean insertAfter(int after,int data){
		boolean result = false;
		Node newNode = new Node();
		newNode.data = data;
		Node curNode = first;
		while(curNode !=null){
			if(curNode.data == after){
				newNode.next = curNode.next;
				curNode.next.previous = newNode;
				newNode.previous = curNode;
				curNode.next = newNode;
				result = true;
				break;
			}
			curNode = curNode.next;
		}
		System.out.println(newNode.previous.data+" "+newNode.data+" "+newNode.next.data);
		return result;
	}
	/////Assuming list is not empty//////////
	public boolean addAfter(int after,int data){
		Node curNode = first;
		while(curNode.data !=after){
			curNode = curNode.next;
			if(curNode == null)
				return false;
		}
		Node newNode = new Node();
		newNode.data = data;
		if(curNode == last){
			curNode.next = null;
			last = newNode;
		}else{
			newNode.next = curNode.next;
			curNode.next.previous = newNode;
			
		}
		newNode.previous = curNode;
		curNode.next = newNode;
		return true;
	}
	
	public int removeKey(int key){
		int temp =-1;
		Node curNode = first;
		while(curNode !=null){
			if(curNode.data == key){
				temp = curNode.data;
				if(curNode == last){
					curNode.previous.next = null;
					last = curNode.previous;
				}else if(curNode == first){
					first = curNode.next;
				}else{
					curNode.next.previous = curNode.previous;
					curNode.previous.next = curNode.next;
				}
				break;
			}
			curNode = curNode.next;
		}
		return temp;
	}
	public void view(){
		Node curNode = first;
		while(curNode !=null){
			curNode.viewNode();
			curNode = curNode.next;
		}
	}
	
}
