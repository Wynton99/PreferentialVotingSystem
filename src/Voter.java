
public class Voter{
	
	//Voter's globalID
	private String globalID = "";
	//Voter's votes; the size of this array will be based off of the number of candidates
	private int[] indVote; 
	
	//Once we have the voter's globalID, make the voter an object. LoadVote gets the voter's votes.
	public Voter(String globalID) {
		super();
		this.globalID = globalID;
	}
	
	public String getGlobalID(){
		return globalID;
	}
	
	//collects the individual voter's votes from this class
	public int[] collectVote(){
		return indVote;
	}
	
	//loads the individual voter's votes into this class
	private void loadVote(int[] indVote){
		
	}
	
}
