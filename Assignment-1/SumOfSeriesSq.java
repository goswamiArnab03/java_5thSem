class SumOfSeriesSq{
	static double result(int n){
		double re=1.0;
		for(int i=1;i<=n;i++){
			re=re+(Math.pow(-1,i))*(double)(1/Math.pow(i,2));
		}
		return re;
	}
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		System.out.println("The result is: "+result(n));
	}
}
