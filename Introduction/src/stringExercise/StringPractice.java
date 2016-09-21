package stringExercise;

public class StringPractice {

	public static void main(String[] args){
		String text = "Hello World";
		String text2 = "Hello ";
		String text3 = "World";
		
		// == vs .equals, very vital when comparing strings
		if(text.equals(text2 + text3)){
			System.out.println("Strings are equal");
		}
		System.out.println(text);
		System.out.println(text2 + text3);
		
		String word1 = "Aarvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word2, lexicongraphically");
		}
	}

}
