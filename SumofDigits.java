package Week1Day1;

public class SumofDigits {
	public static void main(String[] args) {
			int input = 123;
			int sum = input;
			int temp = 0;
			while (sum>0) {
				temp = temp + sum%10;
				sum = sum/10;
				System.out.println("temp is "+ temp);
				
			}
			System.out.println("sum is "+temp);	
	}

}
