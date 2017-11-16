
public class Candidate {
	//primary key for candidate, given by the assignCandNum in the Election Process
	private int candidateNum;
	//Name of candidate, given by the textfile
	private String candidateName;
	
	//Once we have the Candidate's name and number, construct the Candidate class
	public Candidate(int candidateNum, String candidateName) {
		super();
		this.candidateNum = candidateNum;
		this.candidateName = candidateName;
	}

	public int getCandidateNum() {
		return candidateNum;
	}

	public String getCandidateName() {
		return candidateName;
	}	
	
}
