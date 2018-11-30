package elementary_ds;

public class QuickUnionUF {
	
	private int[] id;
	
	public QuickUnionUF(int N) {
		id = new int[N];
		for(int i=0; i < N; i++) {
			id[i] = i;
		}
	}
	
	private int getRoot(int element) {
		while(element != id[element]) {
			element = id[element];
		}
		return element;
	}
	
	public boolean connected(int p, int q) {
		return getRoot(p) == getRoot(q);
	}
	
	public void union(int p, int q) {
		int i = getRoot(p);
		int j = getRoot(q);
		
		id[i] = j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
