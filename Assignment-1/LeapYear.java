class LeapYear{
	static boolean check(int n){
		return (n % 400 == 0) || (n % 4 == 0 && n % 100 != 0);
	}
	public static void main(String[] args){
		if(check(Integer.parseInt(args[0]))) {System.out.println("The year is leap year");}
		else {System.out.println("The year is not leap year");}
	}
}
