
public class Assignment {

	public static void main(String[] args) {
		int num=2;
		
		for (int i = 0; i < 5; i++) {
			for (int s = 0; s < 5-i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= num; j++) {
				if(num>10)
					break;
				System.out.print("*");
			}

			System.out.println("");
			num=num+2;
		}
		
		int num1=1;
		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			for (int j = 10; j >= num1; j--) {
				System.out.print("*");
			}

			System.out.println("");
			num1=num1+2;
		}
		

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

		String[] cityName = {"Raipur","Andhra","Deldi","Mumbai","Hyderabad","TamilNadu"};

		for(String city : cityName){

			if(city.equals("Hyderabad")){
				System.out.println("Found the city as :--- hyderabad so terminating the for loop");
				break;
			}else{
				System.out.println("found city is "+city);
			}
		}

	}
}

