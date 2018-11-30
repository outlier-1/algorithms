package sorting;

public class CompareSorts {

	public static long time(String alg, Comparable<Integer>[] a) {
		long startTime = System.nanoTime();
		if(alg.equals("Insertion")) Insertion.sort(a);
		if(alg.equals("Selection")) Selection.sort(a);
		if(alg.equals("InsertionSentinel")) Insertion.sortSentinel(a);
		if(alg.equals("Shell")) Shell.sort(a);

		long estimatedTime = System.nanoTime() - startTime;
		return estimatedTime;
	}
	
	public static long timeRandomInput(String alg, int N, int T) {
		// Use alg to sort T random arrays of length N
		long total = 0;
		Integer[] arr = new Integer[N];
		for(int t=0; t<T; t++) {
			TemplateSort.fillWithRandom(arr);
			total += time(alg, arr);
		}
		return total;
	}
	
	public static void main(String[] args) {
		int N=50000, T=5;
		long inst = timeRandomInput("Insertion", N, T);
		long shell = timeRandomInput("InsertionSentinel", N, T);


		System.out.println((long)inst);
		System.out.println((long)shell);
	

	}
}
