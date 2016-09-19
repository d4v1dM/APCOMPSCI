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
		Student jillian = new Senior("Jillian","programmer");
		Student jason = new Freshman("jason");
		Student jordan = new Sophomore("jordan");
		Student joseph = new Junior("joseph");
		
		jillian.talk();

		jason.talk();
		jordan.talk();
		joseph.talk();
	}

}
