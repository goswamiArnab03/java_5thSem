import java.util.*;

public class Password{
	public static void main(String[] args){
		String first,middle,last;
		String roll;
		String res="";
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your first name: ");
		first=sc.next();
		System.out.print("Enter your last name: ");
		last=sc.next();
		System.out.print("Enter your roll no:");
		roll=sc.next();
		int len=roll.length();
		String newroll=roll.substring(len-4,len);
		System.out.println("Do You have a middle name?\nIf Yes then press Y otherwise press N ");
		char ch=sc.next().charAt(0);
		switch(ch){
			case 'Y':
				System.out.print("Enter your middle name: ");
				middle=sc.next();
				res=""+first.charAt(0)+middle.charAt(0)+last.charAt(0)+newroll;
				System.out.println("Your Password: "+res);
				break;
			case 'N':
				res=""+first.charAt(0)+last.charAt(0)+newroll;
				System.out.println("Your Password: "+res);
				break;
			default:
				System.out.println("Invalid");
				System.exit(0);
		}
	}
}
