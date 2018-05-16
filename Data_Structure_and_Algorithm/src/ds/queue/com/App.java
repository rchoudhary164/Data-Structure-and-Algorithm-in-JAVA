package ds.queue.com;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue myqueue = new CircularQueue(5);
		myqueue.insert(3);
		myqueue.insert(12);
		System.out.println(myqueue.isFull());
		myqueue.insert(15);
		myqueue.insert(23);
		myqueue.insert(33);
		String output = myqueue.view();
		myqueue.remove();
		myqueue.remove();
		System.out.println(myqueue.isFull());
		output = myqueue.view();
		myqueue.insert(11);
		myqueue.insert(21);
		myqueue.insert(31);
		myqueue.insert(41);
		myqueue.insert(51);
		//myqueue.remove();
		myqueue.insert(39);
		myqueue.insert(59);
		System.out.println(myqueue.finditems());
		System.out.println(myqueue.isFull());
		output = myqueue.view();
		System.out.println(myqueue.peakFront());
		System.out.println(myqueue.peakLast());
	}

}
