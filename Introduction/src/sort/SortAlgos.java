package sort;

public class SortAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6,5,3,1,8,7,2,4}; // test case.
		printArr(arr);
		insertion_sort(arr);
		System.out.println("\n-----------Sorted----------\n");
		printArr(arr);
		
	}
	public static void swap(int[] arr, int a, int b){
		int tmp = arr[a]; 
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	public static void printArr(int[] arr){
		for(int n: arr){
			System.out.println(n);
		}
	}
	public static void insertion_sort(int[] arr){
		int min = 0; // malloc.
		for(int i = 0; i < arr.length - 1; ++i){
			min = i + 1; // initial min.
			for(int j = (i + 1); j > 0; --j){
				if(arr[j] < arr[min]) min = j; // save index of new min.
			}
			if(arr[i] != arr[min]) swap(arr, i, min);
		}
	}

}
