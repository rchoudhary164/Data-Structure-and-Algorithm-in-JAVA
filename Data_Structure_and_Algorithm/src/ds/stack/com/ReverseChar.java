package ds.stack.com;

public class ReverseChar {
	private int top;
	private int maxsize;
	private char[] stack;
	public ReverseChar(int size){
		this.maxsize = size;
		this.stack = new char[maxsize];
		this.top = -1;
	}
	public String insert(char a){
		String resp;
		if(maxsize-1 !=top){
			top++; 
			stack[top] = a;
			resp = a+" inserted";
		}else{
			resp =  "stack is full";
		}
		return resp;
	}
	public String remove(){
		String resp;
		if(top !=-1){
			int old_top = top;
			top --;
			resp = stack[old_top]+"";
		}else{
			resp = "stack is empty";
		}
		return resp;
	}
	public boolean isEmpty(){
		return (top ==-1);
	}
	public boolean isFull(){
		return (maxsize-1 ==top);
	}
	public String view(){
		String out = "[";
		for(int i =top;i>=0;i--){
			out +=stack[i]+" ";
		}
		out +="]";
		return out;
	}
}
