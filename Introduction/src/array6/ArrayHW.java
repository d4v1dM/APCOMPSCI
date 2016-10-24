package array6;

public class ArrayHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test cases
		int[] unsrtd = {5,3,2,5,67,8,64,3,0};
		int[] srtd = { 67,64,8,5,5,3,3,2,0};
		System.out.println(searchSorted(srtd,67));

	}
	public static int searchUnsorted(int[] arrayToSearch, int key){
	    /**
	     * this method take an unsorted int array (arrayToSearch) and returns an 
	     * int corresponding to the index of a key, if it is in the array
	     * if the key is not in the array, this method returns -1
	     * */
		for(int i =  0; i < arrayToSearch.length; i++){
			if(arrayToSearch[i] == key)
				return i;
		}
	     return -1;
	    }
	public static int searchSorted(int[] sortedArrayToSearch, int key){
	    /**
	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
	     * if the key is not in the array
	     * 
	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
	     * */
		int guess,max = 0;
		int min = sortedArrayToSearch.length - 1;
		guess = (int) Math.floor((max + min)/2);
		
		while(key != sortedArrayToSearch[guess] && min >= max){
			if(sortedArrayToSearch[guess] < key) min = guess -1 ;
			else if(sortedArrayToSearch[guess] > key) max = guess + 1;
			
			guess = (int) Math.floor((min + max)/2);
		}
		if(sortedArrayToSearch[guess] == key) return guess;
		return -1;
	}
	public static void reverseOrder(int[] array){
        /**
         * this method reverses the order of the array passed to it.
         * Not that this method does not have a return type. You do not need to copy the array first
         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
         * in a random order, though you still need to reverse whatever order it is in
         * 
         * Example:
         * array = {5, 1, 9, 10, 16, -6}
         * after calling this method
         * array = {-6, 16, 10, 9, 1, 5}
         * 
         * */
		int[] rev = new int[array.length];
		for(int i = array.length - 1, j = 0; i > 0; i--,j++){
			rev[j] = array[i];
		}
		array = rev;
    }

}
