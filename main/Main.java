package main;

import elementary_ds.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacksMakesQueue<Double> st = new TwoStacksMakesQueue<>();
		try {
		st.Enqueue(3.0);
		st.Enqueue(4.1);
		System.out.println(st.Dequeue());
		st.Enqueue(4.2);
		System.out.println(st.Dequeue());
		System.out.println(st.Dequeue());
		System.out.println(st.Dequeue());


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
