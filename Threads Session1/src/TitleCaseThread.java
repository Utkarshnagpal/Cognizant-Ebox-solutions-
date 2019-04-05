import java.util.Scanner;

public class TitleCaseThread extends Thread{

	String []summary;
	String []modifiedSummary;
	
	//Constructor (String []);
	public TitleCaseThread(String []summary) {
		super();
		this.summary = summary;
		
	}

	//Getters and Setters
	public String[] getSummary() {
		return summary;
	}

	public void setSummary(String []summary) {
		this.summary = summary;
	}

	public String[] getModifiedSummary() {
		return modifiedSummary;
	}

	//Producing the modified summary from the summary data attribute
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int lines = summary.length;
		modifiedSummary = new String[summary.length];

		//Iterating the summary array
		for(int i = 0; i < lines; i++){
			
			//Split by space
			String[]tempSentence = summary[i].split(" ");
			int words = tempSentence.length;
			
			//Iterating each word in the sentence and title casing it
			for(int j = 0; j < words; j++){
				
				String firstChar = tempSentence[j].substring(0, 1).toUpperCase();
				String restString = tempSentence[j].substring(1).toLowerCase();
				tempSentence[j] = firstChar + restString;
					
				
			}
			
			//Still in the summary iteration, titlecased string added to modified summary
			modifiedSummary[i] = new String();

			int reconstructionLength = tempSentence.length;
			
			for(int k = 0; k < reconstructionLength; k++){

				if(k == reconstructionLength - 1)
					modifiedSummary[i] = modifiedSummary[i]  + tempSentence[k];
				else
					modifiedSummary[i] = modifiedSummary[i] + tempSentence[k] + " ";
			}
				
		}
		
	}

	
	
	
	
}
