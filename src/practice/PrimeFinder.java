package practice;


public class PrimeFinder {
	protected boolean isPrime(int num) {
		for(int x=(int)Math.sqrt(num); x >=2 ; x--) {
			if(num % x == 0) {
				return false;
			}
		}
		return true;
	}
}
