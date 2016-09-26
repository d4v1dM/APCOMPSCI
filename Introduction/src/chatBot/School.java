package chatBot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolResponse;

	public School(){
		
	}
	public void talk() {
		// TODO Auto-generated method stub
		
		inSchoolLoop = true;
		while(inSchoolLoop){
			David.cleanPrint("Tell me about school.");
			schoolResponse = David.getInput();
			if(schoolResponse.indexOf("school") >= 0){
				inSchoolLoop = false;
				David.talkForever();
			}else{
				David.cleanPrint("Thats my favorite part too");
			}
		}
	}

}
