package sort;

public class MainBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pokemon raticate = new Pokemon("Raticate",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		
		raticate.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Raticate is preparing to attack with super fang");
		raticate.lapse();
		bulbasaur.lapse();
	}
	
	

}
