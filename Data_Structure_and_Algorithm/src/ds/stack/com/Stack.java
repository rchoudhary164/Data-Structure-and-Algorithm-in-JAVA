package ds.stack.com;

public class Stack {
	private int top;
	private int[] localStack;
	private int maxsize;
	public Stack(int size){
		this.maxsize = size;
		this.localStack = new int[maxsize];
		this.top = -1;
	}
	public void insert(int data){
	if(maxsize-1 !=top){
		top++;
		localStack[top] = data;
		}else{
			System.out.println("stack is full");
		}
	}
	public int remove(){
		if(top !=-1){
			int old_top = top;
			top--;
			System.out.println("removing "+localStack[old_top]);
			return localStack[old_top];
		}else{
			System.out.println("stack is Empty");
			return -1;
		}
	}
	public boolean isEmpty(){
		return (top ==-1);
	}
	public int[] getStack(){
		return localStack;
	}
	public boolean isFull(){
		return (maxsize-1 == top);
	} 
	public String view(){
		String out = "[";
		for(int i =top;i>=0;i--){
			out +=localStack[i]+" ";
		}
		out +="]";
		return out;
	}

}
