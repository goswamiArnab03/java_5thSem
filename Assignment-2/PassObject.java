class PassObject{
	class FirstClass{
		int a,b;
		FirstClass(){
			a=5;b=10;
		}
	}
	public class Test{
		int c,d;
		Test(int c,int d){
			this.c=c;
			this.d=d;
		}
		public static void display(Test obj){
			System.out.println("c= "+obj.c+" d= "+obj.d);
		}
		public static void display_dij(FirstClass obj1){
			System.out.println("a= "+obj1.a+" b= "+obj1.b);
		}
	}
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		PassObject outer = new PassObject(); 
		FirstClass dij=outer.new FirstClass();
		Test same = outer.new Test(a,b);
			
		Test.display(same);
		Test.display_dij(dij);
	}
}	
