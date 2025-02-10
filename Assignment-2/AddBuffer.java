import java.io.*;
class AddBuffer{
	static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args)
	throws IOException
	{
	
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter two numbers: ");
		int a=Integer.parseInt(r.readLine());
		int b=Integer.parseInt(r.readLine());
		System.out.println("The result is: "+add(a,b));
	}
}
