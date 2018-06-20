package kr.hs.emirim.hyepago.aopcal.main;

import kr.hs.emirim.hyepago.aopcal.cal.Calculator;
import kr.hs.emirim.hyepago.aopcal.cal.ImpCalculator;
import kr.hs.emirim.hyepago.aopcal.cal.RecCalculator;

public class MainNano {

	public static void main(String[] args) {
		long num = 10000;
		long start1 = System.nanoTime();
		Calculator cal1 = new ImpCalculator();
		long f1 = cal1.factorial(num);
		long end1 = System.nanoTime();
		System.out.printf("Imp factorial(%d): 실행시간 = %d", num, (end1 - start1));
		//System.out.println("Imp 100 : " + f1);
		System.out.println("");
		
		long start2 = System.nanoTime();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.nanoTime();
		System.out.printf("Imp factorial(%d): 실행시간 = %d", num, (end2 - start2));
		//System.out.println("Imp 100 : " + f2);
	}

}
