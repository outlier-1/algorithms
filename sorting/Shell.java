package sorting;

public class Shell {
	
	private static int[] calculateSequence(int N) {
		int boundary = N/3, size=1, h=1, incrementSequence[];
		while(boundary>3) {
			boundary /= 3;
			size++;
		}
		incrementSequence = new int[size];
		for(int i=0; i<size; i++) {
			incrementSequence[i] = h;
			h = 3*h + 1;
		}
		return incrementSequence;
	}
	
	public static void sort(Comparable<Integer>[] arr) {
        // Start with a big h, then reduce the gap
		int h, u[] = calculateSequence(arr.length);
		
		for(int x=u.length - 1; x>=0; x--) {
			h = u[x];
			for(int i=h; i<arr.length; i++) {
        		for(int j=i; j>=h && TemplateSort.less(arr[j], arr[j-h]); j-=h) {
        			TemplateSort.exch(arr, j, j-h);
        		}
        	}
		}
	}
	
	public static void main(String[] args) {
		Comparable<Integer> a[] = new Integer[100000];
		TemplateSort.fillWithRandom(a);
		long startTime = System.nanoTime();
		sort(a);
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime);
		System.out.println(TemplateSort.isSorted(a));
	}
}
