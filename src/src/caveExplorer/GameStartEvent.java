package caveExplorer;

public class GameStartEvent implements Event {

	public static final String[] SEQ_1 = {"A spikey-haired guy with orange pants flies up to you", "Have you arrived to save us from the treacherous Buu?","We need your help."};
	public static final String[] SEQ_2 = {"Great, I will be busy meditating on my super yellow version while you figure out where Buu is.","Kaaa, maaaay...", "By the way, heres a map."};
	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		readSequence(SEQ_1);
		CaveExplorer.print("Will you help us?");
		while(CaveExplorer.in.nextLine().indexOf("yes") < 0){
			CaveExplorer.print("Please say yes. I beg you!");
		}
		readSequence(SEQ_2);
		CaveExplorer.inventory.setHasMap(true);
	}

	private void readSequence(String[] seq) {
		// TODO Auto-generated method stub
		for(String s: seq){
			CaveExplorer.print(s);
			CaveExplorer.print(" - - - Press Enter - - -");
			CaveExplorer.in.nextLine();
		}
		
	}

}
