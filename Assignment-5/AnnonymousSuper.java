//NO 4
//using super class
class SuperAnimal{
	void sound(){
		System.out.println("Animal makes noise");
	}
}

public class AnnonymousSuper{
	public static void main(String[] args){
		SuperAnimal Dog = new SuperAnimal(){
			//@Override
			void sound(){
				System.out.println("Dog barks");
			}
		};
		Dog.sound();
	}
}
