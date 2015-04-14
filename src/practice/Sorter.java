package practice;


public class Sorter {
	protected boolean isPrime(int num) {
		for(int x=2; x<Math.sqrt(num); x++) {
			if(num % x == 0) {
				return false;
			}
		}
		return true;
	}

}
