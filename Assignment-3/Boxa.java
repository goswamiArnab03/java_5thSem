import java.io.*;
class Boxa{
	
	static double volume(int r,int h){
		return 0.33*3.14*r*r*h;
	}
	
	
	static double volume(int a){
		return a*a*a;
	}
	
	public static void main(String[] args){
		Boxa b=new Boxa();
		Console c=System.console();
		System.out.println("Enter the height and radius (Cone): ");
		int h=Integer.parseInt(c.readLine());
		int r=Integer.parseInt(c.readLine());
		
		System.out.println("Enter a sight (Cube): ");
		int a=Integer.parseInt(c.readLine());
		
		
		System.out.println("The volume of Cone is: "+volume(r,h)+"\nThe volume of cube is: "+volume(a));
	}
}
