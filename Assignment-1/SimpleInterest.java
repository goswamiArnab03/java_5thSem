//Write a program to calculate the Simple Interest (si) while your inputs are principle (p), time in years (n) and rate of interest(r)

import java.util.*;

public class SimpleInterest{
	static double claculate(int p,int n,double r){
		return (p*n*r)/100;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal: ");
		int p=sc.nextInt();
		System.out.println();
		System.out.print("Enter time in year: ");
		int n=sc.nextInt();
		System.out.println();
		System.out.print("Enter interest rate: ");
		double r=sc.nextDouble();
		System.out.println();
		System.out.println("The SI is: "+claculate(p,n,r));
	}
}
		
