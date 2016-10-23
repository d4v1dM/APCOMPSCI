package array6;

public class ArrayAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] srtd = {1,5,8,0,3,7};
		srtd = selectSort(srtd);
		for(double s: srtd){
			System.out.println(s);
		}
	}

	public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
		for(int i = 0; i < (array.length - 1);i++){
			if(!(array[i] > array[i + 1])){
				System.out.println("current: " + array[i] + " , next: " + array[i+1]);
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
         return stats;
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
	public static double getMedian(double[] arr){
		double median = 0;
		
		
		return median;
	}
	public static double[] selectSort(double[] arr){
		int select = -1;
		for(int i = 0; i < (arr.length - 1); ++i){
			for(int j = (i+1); j < arr.length; ++j){
				if(arr[j] < arr[i]){
					select = j;
				}
			}
			if(select != -1) swap(arr,i,select);
		}
		return arr;
	}
	public static void swap(double[] arr, int idx1, int idx2){
		double temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2]  = temp;
	}
}
