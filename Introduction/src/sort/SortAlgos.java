package sort;

public class SortAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void insertion_sort(int[] arr){
		int min = 0; // malloc.
		for(int i = 0; i < arr.length; ++i){
			min = i + 1; // initial min.
			for(int j = (i + 1); j > 0; ++j){
				if(arr[j] < arr[min]) min = j; // save index of new min.
			}
		}
	}

}
