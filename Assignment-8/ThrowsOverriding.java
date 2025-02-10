class Parent{
	void showMessage()throws Exception{
		System.out.println("This is parent class exception");
	}
}

class Child extends Parent{
	void showMessage()throws ArithmeticException{
		System.out.println("This is child class exception");
	}
}

class ThrowsOverriding{
	public static void main(String[] args){
		Parent p = new Parent();
		Child c = new Child();
		try{
			p.showMessage();
		}
		catch(Exception e){
			System.out.println("Caught exception: "+e);
		}
		try{
			c.showMessage();
		}
		catch(Exception e){
			System.out.println("Caught exception: "+e);
		}
	}
}
			
	

