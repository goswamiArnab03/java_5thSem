class AddCommand{
	static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("The result is: "+add(a,b));
	}
}
