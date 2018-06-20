package kr.hs.emirim.hyepago.aopcal.cal;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}
	
}
