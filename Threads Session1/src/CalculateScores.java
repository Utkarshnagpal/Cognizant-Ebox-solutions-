import java.io.StreamCorruptedException;
import java.util.StringTokenizer;

public class CalculateScores extends Thread{
	
	String matchType;
	String scoreString;
	Integer []scores;
	
	//Store statistical attributes
	Double meanScore;
	Integer minScore;
	Integer maxScore;
	
	//Constructor (String, String, String)
	public CalculateScores(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}

	//Getters and Setters
	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getScoreString() {
		return scoreString;
	}

	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}

	public Integer[] getScores() {
		return scores;
	}

	public Double getMeanScore() {
		return meanScore;
	}

	public Integer getMinScore() {
		return minScore;
	}

	public Integer getMaxScore() {
		return maxScore;
	}

	//Start the thread to compute statistical attributes
	@Override
	public void run() {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(scoreString, ",");
		int scoreCount = st.countTokens();
				
		maxScore = 0;    //Easiest score to score
		minScore = 600;  //Almost impossible score as minScore
		meanScore = (double) 0;
		
		while(st.hasMoreTokens()){
			
			String tempScore = st.nextToken();
			meanScore += Double.parseDouble(tempScore);
			
			//Update max and min scores
			if(minScore>Integer.parseInt(tempScore))
				minScore = Integer.parseInt(tempScore);
			if(maxScore < Integer.parseInt(tempScore))
				maxScore = Integer.parseInt(tempScore);
	
		}
		
		meanScore = meanScore / scoreCount;
	}
	
	
	

}
