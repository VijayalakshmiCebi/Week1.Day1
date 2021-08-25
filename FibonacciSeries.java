package Week1Day1;



public class FibonacciSeries {
	public static void main(String[] args) {
		int range =  8;
		int firstNum = 0;
		int secNum = 1;
		int Sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i =0; i<range;i++) {
			
			Sum = firstNum+secNum;
			firstNum = secNum;
			secNum = Sum;	
			System.out.println(Sum);
			
		}
		
	}

}
