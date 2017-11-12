
public class Voter{

	private String globalID = "";
	private int[] indVote; //need to get the maxSize from the number of candidates
	
	public Voter(String globalID) {
		super();
		this.globalID = globalID;
	}
	
	public String getGlobalID(){
		return globalID;
	}
	
	public int[] collectVote(){
		return indVote;
	}
	
	private void loadVote(int[] indVote){
		
	}
	
}
