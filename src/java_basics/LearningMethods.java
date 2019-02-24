package java_basics;

import someotherproject.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		System.out.println("Hello, my name");
		//MyName("Roman");
		MyName(3084);
		MyUtils.printSomeJunk(32);
		MyUtils.sum2Numbers(10, 23);
//		int myVar = MyUtils.add10(25);
		System.out.println(MyUtils.add10(25));
		ExampleClass.doSomething();
		
	}
	
	public static void MyName(String name) {
		System.out.println("whatever you want " + name);
	
	}
	public static void MyName(int name) {
		System.out.println("whatever you want " + name);
	
	}
	

}
