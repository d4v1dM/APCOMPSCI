package introUnit;

public class Junior extends Student {

	public Junior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void talk(){	
		super.talk();
		System.out.println("I am a Junior");
	}
}
