class Resource{
	int item;
	boolean availibility;
	synchronized void produce(int k){
		while(availibility==true){
			try{wait();}
			catch(InterruptedException e){}
		}
		item=k;
		System.out.println("The item prodiced: "+k);
		availibility=true;
		notify();
	}
	synchronized void consume(){
		while(availibility==false){
			try{wait();}
			catch(InterruptedException e){}
		}
		availibility=false;
		System.out.println("consumed item: "+item);
		notify();
		
	}
}
class ProducerConsumer{
	public static void main(String[] args){
		final Resource data = new Resource();
		new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					data.produce(i);
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					data.consume();
				}
			}
		}.start();
	}
}
