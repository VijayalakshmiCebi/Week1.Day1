package Week1Day1;

public class ArmstrongNumber {
	public static void main (String[] args) {
	int calculated = 0;
	int quotient = 0;
	int remainder = 0;
	int input = 48;
	int temp = 0;
	temp = input;
	
	while(temp>0) {
		remainder = temp % 10;
		quotient = temp / 10;
		temp = quotient;
		calculated = calculated + (remainder*remainder*remainder);		
		
	}
	if(calculated == input) {
		System.out.println("the given number is amstrong number");
	}
	else {
		System.out.println("the given number is not amstrong number");
	}

}
}

