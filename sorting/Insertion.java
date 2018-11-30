package sorting;

public class Insertion {

	public static void sort(Comparable<Integer>[] arr) {
		for(int i=1; i< arr.length; i++) {
			for(int j=i; j>0 && TemplateSort.less(arr[j], arr[j-1]); j--) {
				TemplateSort.exch(arr, j, j-1);
			}
		} 
	}
	
	/*
	 * Insertion Sort with sentinel. 
	 * Develop an implementetion of insertion sort that eliminates the j>0 test in the inner loop
	 * by first putting the smallest item into position.
	 */
	public static void sortSentinel(Comparable<Integer>[] arr) {
		int min=0;
		for(int i=1; i < arr.length; i++) {
			if(TemplateSort.less(arr[i], arr[min])) min = i;
		}
		TemplateSort.exch(arr, 0, min);
		
		for(int i=2; i < arr.length; i++) {
			for(int j=i; TemplateSort.less(arr[j], arr[j-1]); j--) {
				TemplateSort.exch(arr, j, j-1);
			}
		}
	}
	
	public static void main(String[] args) {
		Comparable<Integer> a[] = new Integer[10000];
		TemplateSort.fillWithRandom(a);
		sortSentinel(a);
		System.out.println(TemplateSort.isSorted(a));
	}
}
