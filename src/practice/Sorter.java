package practice;


public class Sorter {
	protected boolean isPrime(int num) {
		System.out.println("Starting: " + num);
		for(int x=2; x< num; x += 1) {
			System.out.println("Looking at " + x);
			if(num % x == 0) {
				return false;
			}
		}
		return true;
	}

}
