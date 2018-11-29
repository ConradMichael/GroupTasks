package factorials;

public class Main {
	
	public static void main(String[] args) {
		int test = isFactorial(120);
		int isTest2 = isFactorial(150);
	}
	
	public static int isFactorial(int testNumber) {
		int hold = testNumber;		
		
		if(testNumber % 2 == 0) {
			
			for(int i = 2; i <= testNumber; i++) {
				System.out.println(hold);

				System.out.println("I: " + i);

				hold = hold / i;
				
				if(i > hold) {
					System.out.println("999");
					return 999;
				} else
				if(hold == 1) {
					return i;
				}
			}
		}
			return 999;
				
	}
}
