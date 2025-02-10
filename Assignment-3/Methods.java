class Test{
	int a,b;
	Test(int a,int b){
		this.a=a;
		this.b=b;
	}
	int add(){
		return a+b;
	}
}

class Methods{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		Test t=new Test(a,b);
		System.out.println("The addition is: "+t.add());
	}
}
