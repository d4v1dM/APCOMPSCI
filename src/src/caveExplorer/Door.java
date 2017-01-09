package caveExplorer;

public class Door {

	private boolean locked;
	private boolean open;
	private String description;
	private String details;
	
	public Door(){
		this.locked = false;
		this.open = true;
		this.description = "Passage";
		this.details = "";
	}
	public void setLock(boolean b){
		this.locked = b;
	}
	public boolean isLocked(){
		return this.locked;
	}
	public boolean isOpen() {
		return this.open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
	public String getDetails() {
		// TODO Auto-generated method stub
		return this.details;
	}
	
	
}
