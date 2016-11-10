package caveExplorer;

public class EventRoom extends CaveRoom {
	
	private Event event;
	private boolean eventOccured;

	public EventRoom(String description, Event event) {
		super(description);
		// TODO Auto-generated constructor stub
		eventOccured = true;
		this.event = event;
	}
	
	public void enter(){
		super.enter(); // does normal stuff first.
		
	}

}
