class SubCheck{
	public static void main(String[] args){
		String mainstr="University of Technology";
		String substr="Tech";
		
		int ind = mainstr.indexOf(substr);
		
		if(ind==-1){
			System.out.println("Not found");
		}
		else{
			System.out.println("Found at: "+ind);
		}
	}
}
		
