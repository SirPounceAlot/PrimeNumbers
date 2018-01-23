/**
 * John Locklear
 */
package primeNumbers;

public class Main {
		
	public static void main(String[] args) {
		int alpha = 2147483647;
		alpha += 1;
		System.out.println(" alpha = " + alpha);
		float beta = Float.MAX_VALUE;
		beta += 1000;
		System.out.println("Beta = " + beta);
		
		double delta = Double.MAX_VALUE;
		delta ++;
		delta = delta / 0;
		System.out.println(" Delta = " + delta);
		delta += 1;
		System.out.println("after adding 1 to infinity, Delta = " + delta);
		delta = delta - Double.POSITIVE_INFINITY;
		System.out.println(" after subtracting infinity from infinity, delta = " + delta);
		delta+= 1;
		System.out.println("After adding 1 to NaN, Delta = " + delta); 
		int test = 42;
		if(PrimeNumbers.isPrime(test)) {
	} else {
		System.out.println(" 42 is not prime");

		}
		
	}

}