import java.util.*;
class AddScanner{
	static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The result is: "+add(a,b));
	}
}
