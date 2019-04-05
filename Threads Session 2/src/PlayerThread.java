
public class PlayerThread extends Thread{
	
	Main threadMain;
	Integer numberofElements;
	
	//Constructor (Main, Integer)
	public PlayerThread(Main threadMain, Integer numberofElements) {
		super();
		this.threadMain = threadMain;
		this.numberofElements = numberofElements;
	}

	@Override
	public  void run() {
		// TODO Auto-generated method stub

		synchronized(threadMain){
			for(int i =0; i< numberofElements; i++)
				System.out.println("Player Thread " + threadMain.value[i]);
		}
		

//		if(threadMain.getValue() == numberofElements)
//			System.exit(0);
		
	}
	
	

}
