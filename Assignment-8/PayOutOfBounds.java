class OutOfBounds extends Exception{
	//String msg;
	double salary;
	OutOfBounds(String msg){
		super(msg);
	}
	OutOfBounds(double salary){
		this.salary=salary;
	}
	void showval(){
		System.out.println("The value of Salary = "+salary);
	}
}

class PayOutOfBounds{
	void salaryofExp(double sal)throws OutOfBounds{
		System.out.println("The value = "+sal);
		if(sal<=1000) throw new OutOfBounds(sal);
	}
	public static void main(String[] args){
		PayOutOfBounds p = new PayOutOfBounds();
		try{
			p.salaryofExp(900.0);
		}
		catch(OutOfBounds e){
			
			e.showval();
		}
	}
}
