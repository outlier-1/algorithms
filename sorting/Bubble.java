package sorting;

public class Bubble {
	
	public static void sort(Comparable<Integer>[] arr) {
		boolean sorted;
		for(int i=0; i< arr.length - 1; i++) {
			sorted = true;
			for(int j=0; j < arr.length - 1 - i; j++) {
				if(TemplateSort.less(arr[j+1], arr[j])) {
					TemplateSort.exch(arr, j+1, j);
					sorted = false;
				}
			}
			if(sorted) return;
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable<Integer> a[] = new Integer[10000];		
		TemplateSort.fillWithRandom(a);
		sort(a);
		System.out.println(TemplateSort.isSorted(a));

	}

}
