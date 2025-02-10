public class StrToChar{
	public static void main(String[] args){
		char[] ch=args[0].toCharArray();
		System.out.print("The char array: ");
		for(char c:ch){
			System.out.print(c+",");
		}
		System.out.println();
	}
}
