/**
 * John Locklear
 * prime Numbers
 * 11/28/2017
 * It1090c/fall 2017
 * A prime number is divisible only by itself and 1
 * and 1 is not prime
 * another weird fact 2 is prime but also even.
 */
package primeNumbers;

public class PrimeNumbers {

	public static boolean isPrime(int num) {
		boolean result = true;
		if( num == 2) result = true;
		for (int i = 3; i <= num/2; i+=2) {  // check odd numbers only
			if (num % i == 0) {result = false;}// n is evenly divisible by i, n is not prime
		}
		return result;
		

	}

}
