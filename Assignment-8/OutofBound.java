import java.util.*;
class OutofBound{
	static Scanner sc = new Scanner(System.in);
	static void  getElement(String[] str , int[] arr)
	throws ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException{
		System.out.print("Enter the index: ");
		int ind=sc.nextInt();
		System.out.println("The array: "+arr[ind]);
		System.out.println("The array: "+str[ind]);
	}
	
	public static void main(String args[]){
		String[] str;
		int[] arr;
		int n;
		System.out.print("Enter size: ");
		n=sc.nextInt();
		arr=new int[n];
		str=new String[n];
		System.out.println("Enter array element: ");
		for(int i=0;i<n;i++){
			int ele = sc.nextInt();
			arr[i]=ele;
		}
		System.out.println("Enter string array element: ");
		for(int i=0;i<n;i++){
			String ele = sc.next();
			str[i]=ele;
		}
		
		getElement(str,arr);
	}
}
