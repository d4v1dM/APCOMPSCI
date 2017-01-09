package sort;

public class MainBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pokemon raticate = new Pokemon("Raticate",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		
		raticate.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Raticate is preparing to attack with super fang");
		raticate.attack(bulbasaur, new Attack() {
			
			@Override
			public void attack(Pokemon target) {
				// TODO Auto-generated method stub
				System.out.println("Super fang is used!");
				int newHP = target.getHP() / 2;
				target.setHP(newHP);
			}
		});
		bulbasaur.attack(raticate, new Attack() {
			
			@Override
			public void attack(Pokemon target) {
				// TODO Auto-generated method stub
				System.out.println("Poison powder is used!");
				target.setPoisoned(true);
			}
		});
	}
	
	

}
