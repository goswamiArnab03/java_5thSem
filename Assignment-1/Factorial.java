//Write a program to find the factorial of a given integer number using recursion.

public class Factorial{
	static int fact(int n){
		if(n==0 || n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args){
		System.out.println("The factorial is: "+fact(Integer.parseInt(args[0])));
	}
}
