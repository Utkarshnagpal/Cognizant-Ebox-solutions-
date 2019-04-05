import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Integer [] value;
	
	
	public Main(int n) {
		super();
		value = new Integer[n];
	}


	public Integer[] getValue() {
		return value;
	}
 

	public void setValue(Integer []value) {
		this.value = value;
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/*
		//Threads / Session 1/ Predict scores
		Scanner sc = new Scanner(System.in);
		
		int start, end;
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		
		System.out.println("Enter range of numbers");
		start = Integer.parseInt(sc.nextLine());
		end = Integer.parseInt(sc.nextLine());
		
		Scores []sorted = new Scores[2];
		sorted[0] = new Scores(start, end, "ODD");
		sorted[1] = new Scores(start, end, "EVEN");
		
		sorted[0].start();
		sorted[0].join();
		sorted[1].start();
		
		System.out.println("Odd numbers in given range");
		sorted[0].display();
		System.out.println("\nEven numbers in given range");
		sorted[1].display();
		sc.close();
		*/
		
		
		
		/*		
 		//Threads / Session 2/ Team and Player
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Players");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i< n; i ++)
			System.out.println("Player Thread " + i);
		
		sc.close();
		*/
		
		
		//Threads / Session 2/ Team and Player with
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Players");

		int n = Integer.parseInt(sc.nextLine());
		
		Main m = new Main(n);
		
		TeamThread tt = new TeamThread(m, n);
		PlayerThread pt = new PlayerThread(m, n);
		
		tt.start();
		tt.join();
		pt.start();
		
			
		
	}

}
