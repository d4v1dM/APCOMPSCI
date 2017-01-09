package chatBot;

public class DavidHello implements Topic {

	private boolean inHelloLoop;
	private String helloResponse;
	
	// counts how many times hello is replied by user
	private int helloCount;
	
	//response are constants (never change, always exist).
	private static String[] calmResponses = {"We've already said our hellos. Remember?",
			"Yes, hello to you too. Let's actually talk."
	};
	
	private static String[] angryResponses = {
			"Okay, seriously. This has to stop.",
			"You are beginning to annoy me!",
			"We've SAID HELLO!"
	};
	
	public DavidHello(){
		
		// initialize hello counter.
		this.helloCount = 0;
	}
	
	public void talk() {
		// TODO Auto-generated method stub
		
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			
			// responses can be:
			// calm response or angry response.
			printResponse();
			helloResponse = David.getInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = !inHelloLoop;
				David.talkForever();
			}
		}

	}
	public void printResponse(){
		// responses can be:
		// calm response or angry response.
		
		int responseIdx = 0;
		// calm response.
		if(this.helloCount < 5){
			responseIdx = (int) (Math.random() * calmResponses.length);
			David.cleanPrint(calmResponses[responseIdx]);
		}
		else{
			responseIdx = (int) (Math.random() * angryResponses.length);
			David.cleanPrint(angryResponses[responseIdx]);
		}
		
	}

	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		if(David.findKeyword(userInput,"hi",0) >= 0){
			return true;
		}
		if(David.findKeyword(userInput,"hello",0) >= 0){
			return true;
		}
		return false;
	}
	
	
}
