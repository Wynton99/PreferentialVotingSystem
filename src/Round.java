
public class Round{
	//Candidate with the lowest votes; Do we need one here and in the Iterator class if they're both protected?
	protected int lowCand;
	//The round that we're on; Do we need one here and in the Iterator class if they're both protected?
	protected int roundNum;
	
	public Round(){
		
	}
	
	//Removes the lowest candidate
	protected int removeLow(){
		return lowCand;
	}
	
	//Check to see if there is a tie; Possibly send up to Election class so it can call pickTieBreaker?
	protected void checkTie() {
		
	}
	
	//Logic for handling one of the two tiebreaker methods
	private void tieBreakerOne() {
		
	}
	
}
