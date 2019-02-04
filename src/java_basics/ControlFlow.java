package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = false;
		if(!hungry) {
			System.out.println("I am starving...");
			
			}
		
		else {
			System.out.println("I am not hungry");
		}
		
		int hungerRate = 5;
		if (!(hungerRate <6)) {
			System.out.println("NOT HUNGRY");
		
		}
		else {
			System.out.println("very hungry");
				}
		
		int favoriteTemp = 75;
		int currentTemp = 87;
		String opinion;
		
		if(favoriteTemp==currentTemp)
		{
		
			if(currentTemp < favoriteTemp -30) {
				opinion="Cooold";
			}
			else if(currentTemp < favoriteTemp -20) {
				opinion="better";
			}
			else if (currentTemp > favoriteTemp +10) {
				opinion="damme hot";
					}
			else {
				opinion="cool day";
			}
			System.out.println(opinion);
		}else {
			opinion="wrong temp";
		}
		
		int manoTemp = 50;
		String sakyk;
		switch(manoTemp) {
		case 1: sakyk = "salta";
			break;
			
		case 2: sakyk = "vistiek salta";
			break;
			
		case 50: sakyk = "idealu";
			break;
			
		default: sakyk ="nesigavo";
			break;
		
		}
		System.out.println(sakyk);
		
		int month = 4;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "unknown month";
			
		}
		System.out.println(monthString);
				
	}	
	
			
			
}
