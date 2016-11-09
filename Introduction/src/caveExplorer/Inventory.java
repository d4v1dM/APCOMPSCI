package caveExplorer;

public class Inventory {

	private boolean hasMap;
	private String map;
	
	public Inventory(){
		this.hasMap = true;
		this.updateMap();
	}
	private void updateMap() {
		// TODO Auto-generated method stub
		this.map = " ";
		
		for(int i = 0; i < CaveExplorer.caves[0].length; ++i){
			map += "____"; // four underscores.
		}
		map += "___"; // three underscores.
		
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		if(this.hasMap) return this.map;
		return "There is nothing in your inventory.";
	}
	
	public void setMap(boolean b){
		this.hasMap = b;
	}
}
