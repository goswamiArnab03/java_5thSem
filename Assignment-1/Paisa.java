class Paisa{
	static int price(double rs){
		return (int)(rs*100);
	}
	public static void main(String[] args){
		double i=Double.parseDouble(args[0]);
		System.out.println("The price in paisa: "+price(i));
	}
}
