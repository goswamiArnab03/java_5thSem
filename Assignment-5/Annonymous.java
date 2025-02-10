//NO 4
//Annonymous using both interface and super class
class Animal{
	void makesound(){
		System.out.println("Animal makes Sound");
	}
}

interface Vehicle{
	void name();
}

public class Annonymous{
	public static void main(String[] args){
		Animal dog = new Animal(){
			void makesound(){
				System.out.println("Dog barks");
			}
		};
		Vehicle car = new Vehicle(){
			public void name(){
				System.out.println("Lamborgini");
			}
		};
		dog.makesound();
		car.name();
	}
}
