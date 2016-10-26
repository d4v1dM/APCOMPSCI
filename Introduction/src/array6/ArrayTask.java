package array6;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] f = {9,6,3,4,3,8,9};
		int[] s = {9,6,3,4,3,6,7};
		System.out.println(longestSharedSequence(f,s));
		
	}
	public static int longestSharedSeq(int[] array1, int[] array2){
        /**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
		int[] max = (array1.length > array2.length) ? array1 : array2;
		int[] min = (array1.length == max.length) ? array2 : array1;
		int[] longst = new int[max.length];
		boolean found;
		int curr,ctr = 0;
		for(int i = 0; i < min.length; ++i){
			if(min[i] == max[0]){
				found = false;
				curr = min[i];
				for(int j = i; j < max.length; ++j){
					if(curr == min[j]){
						found = true;
						break;
					}
				}
				if(found){
					++longst[ctr];
				} else ++ctr;
			}
		}
        
        return 0;
    }
	public static int longestSharedSequence(int[] array1, int[] array2){
        /**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
		int[] max = (array1.length > array2.length) ? array1 : array2;
		int[] min = (array1.length == max.length) ? array2 : array1;
		System.out.println("max: \n");
		for(int s:max){
			System.out.println(s);
		}
		
		System.out.println("min: \n");
		for(int s:min){
			System.out.println(s);
		}
		int[] longst = new int[max.length];
		boolean found;
		int curr,ctr = 0;
		for(int i = 0; i < min.length; ++i){
			found = false;
			curr = min[i];
			for(int j = i; j < max.length; ++j){
				if(curr == max[j]){
					System.out.println("current: " + curr + " ,max[i]: " + max[j]);
					found = true;
					break;
				}
			}
			if(found){
				++longst[ctr];
			} else{
				System.out.println("New one");
				++ctr;
			}
		}
		for(int s: longst){
			System.out.println(s);
		}
        
        return 0;
    }

}
