//Write a Java Program to swap two numbers using the bitwise operator.

public class Swap{
	int a,b;
	Swap(int a,int b){
		this.a=a;
		this.b=b;
	}
	void swap(){
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap a="+a+" b="+b);
	}
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		Swap s=new Swap(a,b);
		s.swap();
	}
}
		
	
