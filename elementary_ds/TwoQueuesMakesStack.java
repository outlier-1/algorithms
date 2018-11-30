package elementary_ds;

import java.util.Queue;

public class TwoQueuesMakesStack<T> {
	
	private Queue<T> q1;
	private Queue<T> q2;
	
	public TwoStacksMakesQueue(){
		q1 = new Queue<>();
		q2 = new Queue<>();
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
