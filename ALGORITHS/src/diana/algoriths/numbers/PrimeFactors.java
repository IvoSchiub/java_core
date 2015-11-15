package diana.algoriths.numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactors {
		public static void main(String args[]) {
			System.out.printf("Prime factors of number '%d' are : %s %s %n", 35, primeFactors(35), primeFactorsDupl(35)); 
			System.out.printf("Prime factors of integer '%d' are : %s %s %n", 72, primeFactors(72),primeFactorsDupl(72)); 
			System.out.printf("Prime factors of positive number '%d' is : %s %s %n", 189, primeFactors(189), primeFactorsDupl(189)); 
			System.out.printf("Prime factors of number '%d' are as follows : %s %s %n", 232321, primeFactors(232321), primeFactorsDupl(232321)); 
			System.out.printf("Prime factors of number '%d' are as follows : %s %s %n", 67232321, primeFactors(67232321), primeFactorsDupl(67232321)); 
		}
	
		/** * @return prime factors of a positive integer in Java. * @input 40 * @output 2, 5 */ 
		public static Set<Integer> primeFactors(long number) { 
			Set<Integer> primefactors = new HashSet<>(); 
			long copyOfInput = number; 
			for (int i = 2; i <= copyOfInput; i++) { 
				if (copyOfInput % i == 0) { 
					primefactors.add(i); // prime factor 
					copyOfInput /= i; i--; 
				} 
			} return primefactors; 
			
		} 
		
		public static List<Integer> primeFactorsDupl(long number) { 
			List<Integer> primefactors = new ArrayList<>(); 
			long copyOfInput = number; 
			for (int i = 2; i <= copyOfInput; i++) { 
				if (copyOfInput % i == 0) { 
					primefactors.add(i); // prime factor 
					copyOfInput /= i; i--; 
				} 
			} return primefactors; 
		}
	
}
