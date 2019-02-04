package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		int [] values = new int [100];
		values[0] = 1000;  // pirma reiksme bus 0, paskutine 99
		values[99]=5458;
		System.out.println(values[1]); // nera reiksmes, todel mes 0
		
		String [] words = new String[] {"My", "name","is"};
		System.out.println(words[2]);
		
		String [] hoho = new String[3];
		hoho[0] = "your";
		hoho[1] = "soul";
		hoho[2] = "is mine";
		System.out.println(hoho[1]);
	}

}
