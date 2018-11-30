package sorting;

import sorting.TemplateSort;

public class Selection {
	
	public static void sort(Comparable<Integer>[] unsortedArray) {
		for(int i=0; i < unsortedArray.length; i++) {
			int min = i;
			for(int j=i+1; j<unsortedArray.length; j++) {
				if(TemplateSort.less(unsortedArray[j], unsortedArray[min])) min = j;
			}
			TemplateSort.exch(unsortedArray, i, min);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable<Integer> a[] = new Integer[100000];
		
		TemplateSort.fillWithRandom(a);
		sort(a);
		System.out.println(TemplateSort.isSorted(a));
	}

}
