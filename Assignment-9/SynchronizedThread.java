import java.util.*;

class SharedResource{
	synchronized void printMessage(String threadname){
		for(int i=0;i<3;i++){
			try{
				System.out.println("The thread "+threadname+" is executing");
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("The thread "+threadname+" is interupped");
			}
		}
	}
}

class WorkingThread extends Thread{
	private SharedResource resource;
	private String threadname;
	WorkingThread(SharedResource resource,String threadname){
		this.resource=resource;
		this.threadname=threadname;
	}
	
	public void run(){
		resource.printMessage(threadname);
	}
	
}

class SynchronizedThread{
	public static void main(String[] args){
		SharedResource shreresource = new SharedResource();
		
		WorkingThread thr1 = new WorkingThread(shreresource,"Thread-1");
		WorkingThread thr2 = new WorkingThread(shreresource,"Thread-2");
		WorkingThread thr3 = new WorkingThread(shreresource,"Thread-3");
		thr1.start();
		thr2.start();
		thr3.start();
	}
}			
