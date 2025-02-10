class CheckLen{
	public static void main(String[] args){
		String str = "   Arnab  Goswami is a    Student   ";
		int len=str.length();
		System.out.println("With space: "+len);
		int front=0,rear=len-1;
		while(str.charAt(front)==' '){front++;}
		while(str.charAt(rear)==' '){rear--;}
		System.out.println("Without space: "+(rear-front+1));
		
	}
}
		
