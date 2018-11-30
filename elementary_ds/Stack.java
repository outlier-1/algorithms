package elementary_ds;

import java.lang.reflect.Array;
public class Stack<T> {
	
	public T arr[];
	public int top;
	public int capacity;
	
	@SuppressWarnings("unchecked")
	public Stack(Class<T> cls, int capacity) {
		this.arr = (T[]) Array.newInstance(cls, capacity);
		this.capacity = capacity;
		this.top = -1;
	}
	public Stack(T[] arr) {
		this.arr = arr;
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public void Push(T item) throws Exception {
		if(top == capacity - 1) throw new Exception("Stack OverFlow!");
		
		top++;
		arr[top] = item;
	}
	
	public T Pop() throws Exception {
		if(isEmpty()) throw new Exception("Stack UnderFlow!");
	
		top--;
		return arr[top + 1];
	}
	
	public int getSize() { return this.top + 1; }
	
	public void printElements() {
		for(int i=this.top; i>=0; i--) {
			System.out.println(String.format("Stack's %d. Element is : %s", i + 1, this.arr[i]));
		}
	}
}
