import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		//Threads API / Session1/Sort Scores
		Scanner sc = new Scanner(System.in);
		
		SortScore []threadsOfScores = new SortScore[3];
		
		String matchType;
		String scores;
	
		//Thread 1 creation
		System.out.println("Enter the Match :");
		matchType = sc.nextLine();
		System.out.println("Enter the Scores :");
		scores = sc.nextLine();
		
		threadsOfScores[0] = new SortScore(matchType, scores);
		
		threadsOfScores[0].start();
		
		//Thread 2 creation
		System.out.println("Enter the Match :");
		matchType = sc.nextLine();
		System.out.println("Enter the Scores :");
		scores = sc.nextLine();
		
		threadsOfScores[1] = new SortScore(matchType, scores);
		
		//Don't start the second thread unless the first is complete
		threadsOfScores[0].join();
		threadsOfScores[1].start();
		
		//Thread 3 creation
		System.out.println("Enter the Match :");
		matchType = sc.nextLine();
		System.out.println("Enter the Scores :");
		scores = sc.nextLine();
		
		threadsOfScores[2] = new SortScore(matchType, scores);
		
		//Don't start the third thread unless the second is complete
		threadsOfScores[1].join();
		threadsOfScores[2].start();
		
		System.out.println("Ordered Score List");
		threadsOfScores[2].join();
		//Wait till all threads are done
		if(!threadsOfScores[2].isAlive()){
				
			for(int i = 0; i < 3; i++){
				System.out.println("Match : " + threadsOfScores[i].getMatchType());
				Integer []scoreArray = threadsOfScores[i].getScores();
				for(int i1 :scoreArray)
					System.out.println(i1);	
			}
				
		}

		sc.close();
		*/
		
		
		/*
		//Threads API / Session1/Mark Mean, Min and Max
		
		Scanner sc = new Scanner(System.in);
		
		CalculateScores []threadsOfScores = new CalculateScores[3];
		
		String matchType;
		String scores;
	
		//Thread 1 creation
		System.out.println("Enter the match :");
		matchType = sc.nextLine();
		System.out.println("Enter the scores :");
		scores = sc.nextLine();
		
		threadsOfScores[0] = new CalculateScores(matchType, scores);
		
		threadsOfScores[0].start();
		
		//Thread 2 creation
		System.out.println("Enter the match :");
		matchType = sc.nextLine();
		System.out.println("Enter the scores :");
		scores = sc.nextLine();
		
		threadsOfScores[1] = new CalculateScores(matchType, scores);
		
		//Don't start the second thread unless the first is complete
		threadsOfScores[0].join();
		threadsOfScores[1].start();
		
		//Thread 3 creation
		System.out.println("Enter the match :");
		matchType = sc.nextLine();
		System.out.println("Enter the scores :");
		scores = sc.nextLine();
		
		threadsOfScores[2] = new CalculateScores(matchType, scores);
		
		//Don't start the third thread unless the second is complete
		threadsOfScores[1].join();
		threadsOfScores[2].start();
		
		System.out.println("Score Summary");
		threadsOfScores[2].join();
		//Wait till all threads are done
		if(!threadsOfScores[2].isAlive()){
				
			for(int i = 0; i < 3; i++){
				System.out.println("Match : " + threadsOfScores[i].getMatchType());
				System.out.println("Mean : " + String.format("%.2f", threadsOfScores[i].getMeanScore()));
				System.out.println("Min Score : " + threadsOfScores[i].getMinScore());
				System.out.println("Max Score : " + threadsOfScores[i].getMaxScore());
			}
				
		}

		sc.close();
		*/
		
		
		
		//Threads API / Session1/Match Summary to title case
		
		Scanner sc = new Scanner(System.in);
		
		int lines;
		
		System.out.println("Enter the number of lines in the summary");
		lines = Integer.parseInt(sc.nextLine());
		String []summary = new String[lines];
		
		for(int i = 0; i < lines; i++){
			summary[i] = sc.nextLine();
		}
		
		TitleCaseThread tct = new TitleCaseThread(summary);
		
		//Modifying summary
		tct.start();
		tct.join();
		
		String []modSummary = tct.getModifiedSummary();
		
		int lines1 = modSummary.length;
		for(int i = 0; i < lines1; i++)
			System.out.println("Sentence " + (i+1) + " : " + modSummary[i]);
		sc.close();
		
		
		
		
		
	}

}
