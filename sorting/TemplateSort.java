package sorting;
import java.util.concurrent.ThreadLocalRandom;

public class TemplateSort {
	public static void sort(Comparable<Integer>[] a) {
		
	}
	
	// Returns True if x < y, False otherwise.
	public static boolean less(Comparable<Integer> x, Comparable<Integer> y) {
		return x.compareTo((Integer) y) < 0;
	}
	
	public static void exch(Comparable<Integer> a[], int i, int j) {
		Comparable<Integer> tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void show(Comparable<Integer>[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
	
	public static void fillWithRandom(Comparable<Integer>[] a) {
		for(int i=0; i< a.length; i++) {
			a[i] = ThreadLocalRandom.current().nextInt(0, 100000);
		}
	}
	
	public static boolean isSorted(Comparable<Integer>[] a) {
		for(int i=1; i<a.length; i++) {
			if(less(a[i], a[i-1])) return false;
		}
		return true;
	}
	
}
