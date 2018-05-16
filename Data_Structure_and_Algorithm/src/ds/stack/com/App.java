package ds.stack.com;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "PREMANJALI PRASAD";
		ReverseChar stack = new ReverseChar(input.length());
		for(int i=0;i<input.length();i++){
			stack.insert(input.charAt(i));
		}
//		stack.insert(2);
//		stack.insert(3);
//		stack.insert(4);
//		stack.insert(5);
//		stack.remove();
//		stack.insert(6);
//		stack.remove();
//		stack.insert(10);
//		stack.remove();
		String output = stack.view();
		
//		while(!stack.isEmpty()){
//			String val = stack.remove();
//			output +=val;
//			
//		}
		System.out.println(output);
	}

}
