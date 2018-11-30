package elementary_ds;

import java.util.Stack;

public class TwoStacksMakesQueue<T> {
	
	private Stack<T> s1;
	private Stack<T> s2;
	
	public TwoStacksMakesQueue(){
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public void Enqueue(T item) throws Exception {
		s1.push(item);
	}
	
	public T Dequeue() {
		if(!s2.isEmpty()) return s2.pop();
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.pop();
	}
	
}
