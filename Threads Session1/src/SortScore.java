import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SortScore extends Thread{

	String matchType;
	String scoreString;
	Integer []scores;
	
	//Constructor (String, String)
	public SortScore(String matchType, String scoreString) {
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
	//Get an Array of scores
	public Integer[] getScores() {
		return scores;
	}

	public void setScores(Integer[] scores) {
		this.scores = scores;
	}

	//Get an Array of scores

	
	
	//Starting this thread would begin sorting
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//Sorting scoreString variable after splitting
		StringTokenizer st = new StringTokenizer(scoreString, ",");

		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		while(st.hasMoreTokens())	
			scoreList.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(scoreList);
		
		scores = new Integer[scoreList.size()];
		scoreList.toArray(scores);
	}
	
	
	
}
