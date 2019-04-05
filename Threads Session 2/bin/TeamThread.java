
public class TeamThread extends Thread{
	
	Main threadMain;
	Integer numberOfPlayer;
	
	//Constructor (Main, Integer)
	public TeamThread(Main threadMain, Integer numberOfPlayer) {
		super();
		this.threadMain = threadMain;
		this.numberOfPlayer = numberOfPlayer;

	}

	
	public Main getThreadMain() {
		return threadMain;
	}


	public void setThreadMain(Main threadMain) {
		this.threadMain = threadMain;
	}


	public void run(){
		synchronized(threadMain){
		for(int i =0; i< numberOfPlayer; i++){
			threadMain.value[i] = new Integer(i);
		}
			
		
		} 
	
	}
}
