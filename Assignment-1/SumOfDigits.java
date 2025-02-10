class SumOfDigits{
	static int sum(int n){
		int temp=n;
		int res=0;
		while(temp!=0){
			int digit=temp%10;
			res+=digit;
			temp/=10;
		}
		return res;
	}
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		System.out.println("The sum of digits: "+sum(n));
	}
}
