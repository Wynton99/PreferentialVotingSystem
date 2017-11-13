
public class Iterator {
	
	//The round that we're on; Do we need one here and in the Round class if they're both protected?
	protected int roundNum;
	//Candidate with the highest amount of votes
	protected int highCand;
	//Candidate with the lowest amount of votes; Do we need one here and in the Round class if they're both protected?
	protected int lowCand;
	
	public Iterator(){
		
	}
	
	/*
	 * tallies how many votes each candidate has,
	 * We will need the ArrayList of votes from the Votes class
	 */
	private void tallyVotes(){
		
	}
	
	//checks to see if a candidate has more than 50% of the vote
	private void checkMajority(){
		
	}
	
	//Starts the round, or starts another round
	private void initiateRound(){
		
	}
	
	//Sends the winner to the ElectionProcess
	private int passWinnerUp(){
		return highCand;
	}
	
}
