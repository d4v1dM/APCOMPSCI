package datatypes;

public class DataTypes {


	public static void main(String[] args){
		System.out.println(5.0/2);
		System.out.println((double) 5.0/2); // data type will be casted.
		System.out.println(5/2);
		// because 5 and 2 are both integers, so the return type will be integer.
		// added to check if github is working
		System.out.println(3+5.0/2+5*2); //java takes data type that takes most space
		System.out.println(3.0+5/2+5*2); 
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		
		// 10. will not execute since 42 != 42.0 , different data type.
		
		
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		// double numbers are declared.
		// when subtracting, there are numbers after the decimal, since its a double.
		
		
		
		
		
		
		
		
		
		
		
		/*********
		 * 1. wrong data type.
		 * 2.you cant cast an int into a string
		 * 3. Will compile
		 * 4.will compile
		 * 5.will compile
		 * 6.will compile
		 * 7.will compile
		 * 8.compiled
		 * 9.compiled
		 * 10.compiled.
		 * 
		 */
	}


}
