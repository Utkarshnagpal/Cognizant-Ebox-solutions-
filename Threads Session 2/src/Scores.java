import java.util.ArrayList;

public class Scores extends Thread{

	Integer start;
	Integer end;
	String scoreType;
	ArrayList<Integer> scoreList;
	
	//Constructor (Integer, Integer, String)
	public Scores(Integer start, Integer end, String scoreType) {
		super();
		this.start = start;
		this.end = end;
		this.scoreType = scoreType;
	}

	//Getters and Setters
	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}


	public String getScoreType() {
		return scoreType;
	}

	public ArrayList<Integer> getScoreList() {
		return scoreList;
	}

	
	public void display(){
		
		for(int score :scoreList)
			System.out.print(score + " ");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		scoreList = new ArrayList<Integer>();
		
		if(this.scoreType.equals("ODD")){
			for(int i = ((start/2)*2)+1; i <= end; i += 2)
				scoreList.add(i);
		}
		else{
			for(int i = (((start+1)/2)*2); i <= end; i += 2)
				scoreList.add(i);
		}
			
	}
	
	
	
}
