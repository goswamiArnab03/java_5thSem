/*Write a program to find the roots of the quadratic equation ax2 + bx + c = 0 where a, b and c are constants.*/

import static java.lang.Math.*;

class QurRoot{
	void calculateRoot(int a,int b,int c){
		double dis=(b*b)-4*a*c;
		if(dis>0.0){
			double p=(-b+sqrt(dis))/2*a;
			double q=(-b-sqrt(dis))/2*a;
			System.out.println("The roots are: "+p+" "+q);
			return;
		}
		else if(dis==0){
			double r=(-b)/2*a;
			System.out.println("Only one root is: "+r);
			return;
		}
		else{
			double r=(-b)/(2.0*a);
			double s=sqrt(-dis)/(2*a);
			System.out.printf("The roots are imaginary and the roots are %lf+i%lf and %lf-i%lf\n",r,s,r,s);
			return;
		}
	}
}
public class Roots{
	public static void main(String[] args){
		QurRoot qr=new QurRoot();
		qr.calculateRoot(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	}
}
