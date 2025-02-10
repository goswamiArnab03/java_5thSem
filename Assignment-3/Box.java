import java.io.*;
class Box{
	class Cone{
		int h,r;
		Cone(int h,int r){
			this.h=h;
			this.r=r;
		}
		double volume(){
			return 0.33*3.14*r*r*h;
		}
	}
	class Cube{
		int a;
		Cube(int a){
			this.a=a;
		}
		double volume(){
			return a*a*a;
		}
	}
	public static void main(String[] args){
		Box b=new Box();
		Console c=System.console();
		System.out.println("Enter the height and radius (Cone): ");
		int h=Integer.parseInt(c.readLine());
		int r=Integer.parseInt(c.readLine());
		Cone co=b.new Cone(h,r);
		System.out.println("Enter a sight (Cube): ");
		int a=Integer.parseInt(c.readLine());
		
		Cube cu=b.new Cube(a);
		System.out.println("The volume of Cone is: "+co.volume()+"\nThe volume of cube is: "+cu.volume());
	}
}
