/*Write a program to check whether a given integer number is palindrome or not (1 st day using static i/p and 2 nd day using com-
mand-line argument).*/

public class Palindrom{
	static boolean isPalindrom(int x){
		int temp=x;int rev=0;
		while(x!=0){
			int r=x%10;
			x=x/10;
			rev=rev*10+r;
		}
		if(temp==rev){
			return true;
		}
		else return false;
	}
	public static void main(String[] args){
		int x=Integer.parseInt(args[0]);
		if(isPalindrom(x))System.out.println("No. is palindrom");
		else System.out.println("No. is not palindrom");
	}
}
