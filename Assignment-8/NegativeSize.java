import java.util.*;
import java.io.*;
class NegativeSize{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			int size=sc.nextInt();
			int[] arr=new int[size];
			for(int i=0;i<size;i++){
				arr[i]=i+1;
			}
			System.out.print("The elements: ");
			for(int i=0;i<size;i++){
				System.out.print(arr[i]+" ");
			}
		}
		catch(NegativeArraySizeException e){
			System.out.println("Negative Array Size");
		}
	}
}
			
		
