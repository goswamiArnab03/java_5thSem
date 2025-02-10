//NO 4
//using Interface
interface VehicleInter{
	void name();
}

public class AnnonymousInterface{
	public static void main(String[] args){
		VehicleInter car = new VehicleInter(){
			public void name(){
				System.out.println("Lamborgini");
			}
		};
		car.name();
	}
}
