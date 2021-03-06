package array6;

public class ArrayAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] r = generateDistinctItemsList(10);
		for(int s:r){
			System.out.println(s);
		}
	}
		
		
	public static void rev(int[] arr){
		int len = (int) Math.floor(arr.length/2);
		for(int i = 0, j = arr.length - 1; i < len; ++i,--j){
			swap(arr,i,j);
		}
		System.out.println("Reversed: \n");
		for(int s: arr){
			System.out.println(s);
		}
	}

	public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
		for(int i = 0; i < (array.length - 1);i++){
			if(array[i] < array[i + 1]){
				return false;
			}
		}
        return true;
    }
	public static double[] getStats(double[] array){
        /** 
         * This method return a double[] contain a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean
         * index 1 = the max
         * index 2 = the min
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
         * */
         double[] stats = new double[6];
         stats[0] = getAvg(array);
         stats[1] = getMax(array);
         stats[2] = getMin(array);
         stats[3] = getMedian(array);
         stats[4] = greaterMean(array);
         stats[5] = lessMean(array);
         return stats;
    }
	public static double getMedian(double[] arr){
		selectSort(arr);
		int len = arr.length;
		if(len % 2 != 0) return (arr[(len - 1)/2]);
		else return ((double)((arr[len/2] + arr[(len/2) - 1])/2)); // get avg.
	}
	public static double getAvg(double[] array){
		double sum = 0;
		int len = array.length;
		for(int i = 0; i < len; ++i){
			sum += array[i];
		}
		return ((double)(sum/len));
	}
	public static double getMax(double[] array){
		// get maximum value of double[] array.
		double max = array[0]; // assume first value is max.
		int len = array.length;
		
		for(int i = 1; i < len; ++i){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}
	public static double getMin(double[] arr){
		// get minimum value of double[] array.
		double min = arr[0]; // assume first value is min.
		int len = arr.length;
		
		for(int i = 1; i < len; ++i){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	public static int greaterMean(double[] arr){
		double mean = getAvg(arr);
		int ctr = 0;
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] > mean){
				++ctr;
			}
		}
		return ctr;
	}
	public static int lessMean(double[] arr){
		double mean = getAvg(arr);
		int ctr = 0;
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] < mean){
				++ctr;
			}
		}
		return ctr;
	}
	public static void selectSort(double[] arr){
		for(int i = 0; i < (arr.length - 1); i++){
			int min = i;
			for(int j = (i+1); j < arr.length; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			if(min != i) swap(arr,i,min); // only swap if you have to.
		}
	}
	public static void swap(double[] arr, int idx1, int idx2){
		double temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2]  = temp;
	}
	public static void swap(int[] arr, int idx1, int idx2){
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2]  = temp;
	}
	private static void shuffle(int[] arr){
		for(int i = 0; i < arr.length; ++i){
			int random = (int) (Math.random() * arr.length);
			swap(arr,i,random);
		}
	}
	public static int countDifferences(int[] array1, int[] array2){
        /**Here, you will write an method that returns the number of values in two arrays 
         * that are NOT the same (either in value OR location).
         * The arrays ALWAYS have the same length
         * Examples:
         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
         * 
         * */
		int ctr = 0;
		for(int i = 0; i < array1.length; i++){
			if(array1[i] == array2[i]) continue;
			ctr++;
		}
         return ctr;
    }
	public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consecutive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
		int[] longst = new int[array1.length]; // storing the number of possible consecutives.
		int ctr = 0;
		++longst[ctr]; // since everything is 0 when initialized, we the first item has to be increased to one.
		for(int i = 0; i < (array1.length - 1); ++i){
			if(array1[i] == (array1[i + 1] - 1)) ++longst[ctr];
			else{
				++ctr;
				++longst[ctr];
			}
		}
		
		int max = 1;
		for(int i = 0; i < (ctr +1); ++i){
			if(longst[i] > max) max = longst[i];
		}
        return max; // max will be returned.
    }
	public static int[] generateDistinctItemsList(int n){
        /**
         * This method needs to generate an int[] of length n that contains distinct, random integers
         * between 1 and 2n 
         * The method will be tested by verifying that the array you return is n items long,
         * contains only entries between 1 and 2n (inclusive) and has no duplicates
         * 
         * */
		int[] rand = new int[n];
		int randNum;
		for(int i = 0; i < n; ++i){
			do{
				randNum = ((int) (Math.random() * (2*n))) + 1;
			}while(hasItem(rand,randNum,i));
			rand[i] = randNum;
		}		
        return rand; 
    }
	public static boolean hasItem(int[] lst, int n, int end){
		for(int i = 0; i < end; ++i){
			if(lst[i] == n) return true;
		}
		return false;
	}
	public static int longSeq(int[] array1, int[] array2){
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
		
		// not really needed, but seems nicer to seperate them.
		int[] max = (array1.length > array2.length) ? array1 : array2;
		int[] min = (array2.length == max.length) ? array1 : array2;
		
		int[] longst = new int[max.length];// counter to store the sequences.
		boolean found; // keeps track to see if number of subArray was found in other Array.
		int ctr = 0; // will keep track of new sequence.
		for(int i = 0; i < min.length; ++i){ // loop through min array.
			found = false; // default will be item not found.
			for(int j = i; j < max.length; ++j){ // iterate through other array, starting at i.
				if(min[i] == max[j]){ // item was found!
					found = true; // found changes to true.
					break; // get out of inner loop.
				}
			}
			if(!found) ++ctr; // not found -> restart ctr;
			else ++longst[ctr]; // increase value of ctr if found.
		}
		
		// get the greatest number from the ctr array.
		int maxSeq = 0; // zero is default if nothing shared.
		for(int i = 0; i < (ctr+1); ++i){
			if(longst[i] > maxSeq){
				// number is bigger -> new max sequence.
				maxSeq = longst[i];
			}
		}
        return maxSeq;
    }
	public static void cycleThrough(int[] array, int n){
        /** This problem represents people moving through a line.
         * Once they get to the front of the line, they get what they've been waiting for, then they 
         * immediately go to the end of the line and "cycle through" again.
         * 
         * This method reorders the array so that it represents what the array would look like
         * after it had been cycled through an n number of times.
         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
         * 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
         * 
         * Likewise,
         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
         * and the most interesting case, 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
         * was able to go through one more time than anyone else
         * 
         * CHALLENGE
         * For extra credit, make your method handle NEGATIVE n
         * */
         for(int i = 0; i < n; ++i){
             cycleOnce(array);
         }
    }
    public static void cycleOnce(int[] arr){
        /*
            START- 0 1 2 3 4 5
            END-   1 2 3 4 5 0
        */
        swap(arr,0,arr.length - 1);
        for(int i = 0; i < arr.length - 2;++i){
            swap(arr,i,(i+1));
        }
    }
	public static int countUnderBound(double[] arr, double d){
		// return number of numbers that are less then param d.
		int ctr = 0;
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] < d){
				++ctr;
			}
		}
		return ctr;
	}
	public static int[] getSubArray(int[] arr, int startIdx, int endIdx){
		/*
		 * return an array containing elements from startIndex to endIndex
		 * @param arr
		 * @param startIdx
		 * @param endIdx
		 * @return 
		 */
		int[] subArr = new int[(endIdx - startIdx) + 1];
		for(int i = 0; i < subArr.length; ++i){
			subArr[i] = arr[i + startIdx];
		}
		return subArr;
	}
	public static boolean contains(int[] arr, int[] subArray){
		for(int i=0; i < arr.length; ++i){
			if(arr[i] == subArray[0]){
				int j = 1;
				for(; (j < subArray.length) && (i < arr.length); ++j){
					++i;
					if(subArray[j] != arr[i]) break;
				}
				if(j == subArray.length) return true;
			}
		}
		return false;
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
		
		int ctr = 0;
		int longest = 0;
		for(int i = 0; i < array1.length; ++i){
			for(int j = 0; j < array2.length; ++j){
				if((i + ctr) < array1.length){
					if(array1[i + ctr] == array2[j]){
						++ctr;
					}
					else{
						ctr = 0;
					}
					if(ctr > longest) longest = ctr;
				}
			}
		}
		return longest;
    }
}
