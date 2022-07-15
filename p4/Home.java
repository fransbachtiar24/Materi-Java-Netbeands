class Home{
	public static void main(String[] args){
		//Class Object = new Class();
		// cara membuat object
		Bicycle roadBike = new Bicycle();

		// cara menggunakan attribute
		System.out.println(roadBike.speed);

		// cara menggunakan method void
		roadBike.speedUp();
		
		System.out.println(roadBike.speed);
	}
}