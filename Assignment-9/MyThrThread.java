import java.util.*;
class MyThread1 extends Thread{
	MyThread1(String name){
		super(name);
		System.out.println("The thread "+name+" is created");
	}
	public void run(){
		for(int i=0;i<3;i++){
		
			try{
				System.out.println("The thread "+getName()+" is Running");
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("The thread "+getName()+" is interupped");
			}
		}
		System.out.println("The thread "+getName()+" has finished");
	}
}

public class MyThrThread{
	public static void main(String[] args){
		MyThread1 thread1 = new MyThread1("MyThread");
		thread1.start();
		for(int i=0;i<3;i++){
			try{
				System.out.println("The main thread is running"+(i+1));
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println("Main thread caught exception");
			}
		}
		System.out.println("The main thread finished");
	}
}
