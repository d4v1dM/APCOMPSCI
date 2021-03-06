package caveExplorer;

public class Inventory {

	private boolean hasMap;
	private String map;
	
	public Inventory(){
		this.hasMap = false;
		this.updateMap();
	}
	public void updateMap() {
		// TODO Auto-generated method stub
		this.map = " ";
		
		for(int i = 0; i < CaveExplorer.caves[0].length - 1; ++i){
			map += "____"; // four underscores.
		}
		map += "___\n"; // three underscores.
		
		for(CaveRoom[] row: CaveExplorer.caves){
			// three rows of text.
			for(int i = 0; i < 3; ++i){
				// a line of text for each
				String text = "";
				for(CaveRoom cr: row){
					//text = "|";
					if(cr.getDoor(CaveRoom.WEST) != null && cr.getDoor(CaveRoom.WEST).isOpen()){
						text = " ";
					} else{
						text += "|";
					}
					if(i == 0){
						text += "   "; // three spaces.
					}
					else if(i == 1){
						text += " " + cr.getContents() + " ";
					}
					else if(i == 2){
						if(cr.getDoor(CaveRoom.SOUTH) != null && cr.getDoor(CaveRoom.SOUTH).isOpen()){
							text += "   "; // three spaces.
						}
						else{
							text += "___"; // 3 horizontal lines.
						}
					}
				} // last cave room in the row.
				text += "|";
				map += text + "\n";
			} // last of the three text lines.
		} // very last row.
		
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		if(this.hasMap) return this.map;
		return "There is nothing in your inventory.";
	}
	
	public void setHasMap(boolean b){
		this.hasMap = b;
	}
}
