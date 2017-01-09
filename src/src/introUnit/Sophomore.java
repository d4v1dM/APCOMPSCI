package introUnit;

public class Sophomore extends Student {

	public Sophomore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void talk(){
		super.talk();
		System.out.println("I am a Sophomore!");
	}
}
