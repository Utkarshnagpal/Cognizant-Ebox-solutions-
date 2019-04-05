/*import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		//Exception session2/Custom Exception
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		
		System.out.println("Enter the player name");
		name = sc.nextLine();
		System.out.println("Enter the player age");
		
		try{
			age = Integer.parseInt(sc.nextLine());
			if(age < 19)
				throw new CustomException();
			else
				System.out.println("Player name : " + name + "\nPlayer age : " + age);
				
		}
		catch(CustomException ce){
			System.exit(0);
		}
		
		
		
		
		
		
		//Eception session2/TeamNameNotFound
		Scanner sc = new Scanner(System.in);
		
		String []teamList = {"Chennai Super Kings", "Royal Challengers Bangalore", "Rajasthan Royals", "Deccan Chargers", "	Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians", "Delhi Daredevils"};
		
		
		boolean flag = false;
		try{
			
			System.out.println("Enter the expected winner team of IPL Season 4");
			String winnerTeam = sc.nextLine();
			
			for(String str: teamList){
				if(winnerTeam.equals(str)){
					flag = true;
					break;
				}
			}
			
			if (!flag)
				throw new TeamNameNotFound();
			
			flag = false;
			
			System.out.println("Enter the expected runner Team of IPL Season 4");
			String runnerUp = sc.nextLine();
			
			for(String str: teamList){
				if(runnerUp.equals(str)){
					flag = true;
					break;
				}
			}
			
			if (flag == false)
				throw new TeamNameNotFound();
			
			System.out.println("Expected IPL Season 4 winner: " + winnerTeam);
			System.out.println("Expected IPL Season 4 runner: " + runnerUp);
		}
		
		catch(Exception e){}
		
		sc.close();
		
		
		
		
		//Exception session2/OverRangeException
		
		Scanner sc = new Scanner(System.in);
		
		int runs;
		int overs;
		
		System.out.println("Enter the total runs scored");
		runs = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the total overs faced");
		
		try{
			overs = Integer.parseInt(sc.nextLine());
			if(overs >20 || overs<0)
				throw new OverRangeException();
			else{
				System.out.println("Current Run Rate :" + String.format("%.2f", ((float)runs/(float)overs)));
			}
		}
		catch (Exception e){}
		
		
		
	}
		

}*/


//Duplicate ID
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {

            
        //fill your code
    	
    	Scanner sc = new Scanner(System.in);
    	
    	String teamName;
    	int playerCount;
    	System.out.println("Enter the team name");
    	teamName = sc.nextLine();
    	System.out.println("Enter the number of players suggested");
    	playerCount = Integer.parseInt(sc.nextLine());
    	
    	String []playerList = new String[playerCount];
    	String []idList = new String[playerCount];
    	
    	
    		
    	try{
    		
    		for(int i = 0; i < playerCount; i++){
    			System.out.println("Enter player " + (i+1) + " details");
        		idList[i] = sc.nextLine();
        		playerList[i] = sc.nextLine();
        		
        		//Check IDs for duplicacy
        		for(int j = 0; j < i; j++){
        			if(idList[i].equals(idList[j]))
        				throw new DuplicateIdException("DuplicateIdException: Player Id must be unique");
        			
        		}
        		
    		}
    		for(int i1 = 0; i1 < playerCount; i1++){
    			System.out.println(idList[i1] + " " + playerList[i1]);
    		}
    		
    		
    	}
    		catch(Exception e){
    			
    		}
    		
    	sc.close();
    	
    }
}

