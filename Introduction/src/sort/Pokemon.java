package sort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	
	
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		this.hp = 100;
		this.poisoned = false;
	}
	public boolean isPoisoned(){
		return this.poisoned;
	}
	public void iChooseYou(){
		System.out.print("\n" + this.name + "\n");
	}
	public int getHP(){
		return this.hp;
	}
	public String getName(){
		return this.name;
	}
	public void setHP(int newHP){
		this.hp = newHP;
	}
	public void setPoisoned(boolean b){
		this.poisoned = b;
	}
	public void lapse(){
		if(isPoisoned()) this.hp -= 15;
	}
	
}
