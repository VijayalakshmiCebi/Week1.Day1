package Week1Day1;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact*i;
			
		}
		System.out.println("factorial of 5 is "+ fact);

	}

}
