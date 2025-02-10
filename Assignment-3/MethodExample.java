class MethodOverloadExample{
	int calculate(int a,int b){
		return a+b;
	}
	double calculate(int a,int b){
		return (double)(a+b);
	}
	public static void main(String[] args){
		MethodOverloadExample e=new MethodOverloadExample();
		System.out.println("Result: "+e.calculate(5,3));
	}
}
