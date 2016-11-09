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
		map += "___\n"; // three underscores.
		
		for(CaveRoom[] row: CaveExplorer.caves){
			// three rows of text.
			for(int i = 0; i < 3; ++i){
				// a line of text for each
				for(CaveRoom cr: row){
					String text = "|";
					if(cr.getDoor(CaveRoom.WEST) != null && cr.getDoor(CaveRoom.WEST).isOpen()){
						text = " ";
					}
					if(i == 0){
						text += "   "; // three spaces.
					}
					else if(i == 1){
						text += " " + cr.getContents() + " ";
					}
					else if(i == 2){
						
					}
				}
			}
		}
		
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
