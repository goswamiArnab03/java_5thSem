import java.util.*;

class MyThread2 implements Runnable{
	MyThread2(){
		
		System.out.println("The thread from Runnable is created ");
	}
	public void run(){
		for(int i=0;i<3;i++){
			try{
				System.out.println("The thread "+Thread.currentThread().getName()+" is executing");
				Thread.sleep(1000);
			}
			catch(Exception e){
				 System.out.println("The thread "+Thread.currentThread().getName()+" is interupted");
			}
		}
		System.out.println("The thread "+Thread.currentThread().getName()+" is finished");
	}
}

class MyThrRunnable{
	public static void main(String[] args){
		MyThread2 thread2 = new MyThread2();
		
		Thread MyThr = new Thread(thread2,"MyThread2");
		MyThr.start();
		for(int i=0;i<3;i++){
			try{
				System.out.println("The thread "+Thread.currentThread().getName()+" is executing");
				Thread.sleep(1000);
			}
			catch(Exception e){
				 System.out.println("The thread "+Thread.currentThread().getName()+" is interupted");
			}
		}
		System.out.println("The thread "+Thread.currentThread().getName()+" is finished");
	}
}
		
