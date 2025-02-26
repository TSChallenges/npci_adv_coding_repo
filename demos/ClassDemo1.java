public class ClassDemo1{
	public static void main(String[] arg){
		Vehicle myInnova = new Vehicle("V3");
		myInnova.type = "4 Wheeler";
		myInnova.price = 999999f;

		myInnova.printDetails();

		System.out.println("Base Price of the vehicle is " + myInnova.getBasePrice());

		System.out.println("OnRoad Price of the vehicle is " + myInnova.getOnRoadPrice());

		double tax = 5000;
		String state = "TG";

		double finalPrice = myInnova.calculateOnRoadPrice(tax,state);


	}
}


class Vehicle{
	String type;
	String model;
	double price;

	public Vehicle(){
		this.model = "V2";
	}

	public Vehicle(String model){
		this.model = model;
	}

	public Vehicle(String model, int year){
		this.model = model + year;
	}

	public Vehicle(String t, String m, double p){
		this.model = m;
		this.type = t;
		this.price = p;
	}

        public double calculateOnRoadPrice(double roadTax, String stateCode){
               return price + roadTax;
	}

	public void printDetails(){
		System.out.println("Type: " + type);
		System.out.println("Model : " + model);
		System.out.println("Base Price: " + price);
	}

	public double getBasePrice(){   
		return price;
	}

	public double getOnRoadPrice(){
		double onRoadPrice = price + 2000;
		return onRoadPrice ;
	}

}