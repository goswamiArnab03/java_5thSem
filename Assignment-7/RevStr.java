import java.util.*;
class RevStr{
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str=sc.next();
		System.out.print("In reverse order: ");
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}
