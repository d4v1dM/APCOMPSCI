package chatBot;

public class DavidsLike implements Topic {

	private boolean inLikeLoop;
	private String likeResponse;
	
//	public DavidsLike(){
//		
//	}
	
	public void talk() {
		// TODO Auto-generated method stub
		
		David.cleanPrint("What are some things you like? ");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = David.getInput();
			int likePsn = David.findKeyword(likeResponse,"like",0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				David.cleanPrint("You're such an interesting person, because you like" + thingsLiked);
				if(David.findKeyword(thingsLiked, "school", 0) >= 0){
					inLikeLoop = false;
					David.school.talk();
				}
				else{
					inLikeLoop = false;
					David.talkForever();
				}
			}
			else{
				David.cleanPrint("I don't understand you.");
			}
		}
	}
	
	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		if(David.findKeyword(userInput,"like",0) >= 0){
			return true;
		}
//		if(David.findKeyword(userInput,"class",0) >= 0){
//			return true;
//		}
		return false;
	}

}
