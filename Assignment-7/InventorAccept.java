import java.util.*;
class InventorAccept{
	public static void main(String[] args){
		String inventor="Gosling";
		String input="";
		int t=3;
		Scanner sc = new Scanner(System.in);
		while(t-->0){
			System.out.print("Enter your answer: ");
			input=sc.next();
			if(inventor.equalsIgnoreCase(input)){
				System.out.println("Congratulations! Correct Answer");
				System.exit(0);
			}
			if(t!=0)
			System.out.println("oops! Try agin");
		}
		System.out.println("The correct aswer is: "+inventor);
	}
}
