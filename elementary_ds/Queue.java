package elementary_ds;

import java.lang.reflect.Array;
public class Queue<T> {
	
	private T arr[];
	public int head;
	public int tail;
	private int size;
	
	@SuppressWarnings("unchecked")
	public Queue(Class<T> cls, int capacity) {
		this.arr = (T[]) Array.newInstance(cls, capacity);
		this.head = 0;
		this.tail = -1;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void Enqueue(T item) throws Exception {
		if(tail + 1 == head && !isEmpty()) throw new Exception("Queue OverFlow!");
		if(tail == arr.length - 1) tail = -1;

		size++;
		tail++;
		arr[tail] = item;
	}
	
	public T Dequeue() throws Exception {
		if(isEmpty()) throw new Exception("Queue UnderFlow!");
		T dequeuedItem = arr[head];
		if(head == arr.length - 1) head = -1;
		
		size--;
		head++;
		return dequeuedItem;
	}
	
	public int getSize() { return this.size; }
	
}
