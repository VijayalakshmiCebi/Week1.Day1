package Week1Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int inputNum = 13;
		boolean temp = true;
		
		for (int i = 2; i < (inputNum / 2); i++) {
			int rem = inputNum%i;
			//System.out.println(rem);
			if (rem == 0) {
				temp = false;
				break;

			}
			//System.out.println("inside for");
			//System.out.println("temp value "+temp);

		}
		//System.out.println("after break");
		if (temp == false) {
			System.out.println("Given number is not prime");

		} else {
			System.out.println("given number is prime");
		}

	}

}
