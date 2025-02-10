import java.util.*;
class Arithmetic{
	int add(int a , int b) 
	throws ArithmeticException{
		return a/b;
	}
		
	
	
	public static void main(String[] args){
		Arithmetic ar = new Arithmetic();
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("The result = "+ ar.add(a,b));
	}
}
