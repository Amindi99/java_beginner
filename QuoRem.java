package basic;

public class QuoRem {

	public static void main(String[] args) {

		//initialize a number and its divisor
		int dividend = 25, divisor = 4;

		//quotient
		int quotient = dividend / divisor;
		//remainder
		int remainder = dividend % divisor;

		//display output
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}

}
