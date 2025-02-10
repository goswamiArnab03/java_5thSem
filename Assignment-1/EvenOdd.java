class EvenOdd{
	static boolean check(int n){
		return (n%2==0);
	}
	public static void main(String[] args){
		if(check(Integer.parseInt(args[0]))) System.out.println("The no is even");
		else System.out.println("The no is odd");
	}
}
