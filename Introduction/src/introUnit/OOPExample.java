/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 * This class is designed to contrast with the proceduralExample. It embodies an Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student jason = new Student("jason");
		Student jordan = new Student("jordan");
		
		jillian.talk();
		jason.talk();
		jordan.talk();
		
	}

}
