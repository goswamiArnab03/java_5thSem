/*Write a program to find the reverse of a given integer number*/

public class Reverse{
	static void findRev(int x){
		int temp=x;int rev=0;
		while(x!=0){
			int r=x%10;
			x=x/10;
			rev=rev*10+r;
		}
		System.out.println("The reverse of the no is: "+rev);
	}
	public static void main(String[] args){
		findRev(Integer.parseInt(args[0]));
	}
}
