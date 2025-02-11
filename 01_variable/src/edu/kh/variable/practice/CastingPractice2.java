package edu.kh.variable.practice;

public class CastingPractice2 {

	public static void main(String[] args) {
	
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch2 = 'A';
		
		System.out.println(iNum1/iNum2); // 2
		System.out.println((int)dNum); // 2 정답
		
		System.out.println( iNum2 * dNum ); // 10.0 정답
		System.out.println((double)iNum1); // 10.0 정답
		
		System.out.println((double) iNum1 / iNum2 ); // 2.5 정답
		System.out.println( dNum ); // 2.5 정답
		
		System.out.println((int)fNum); // 3 정답
		System.out.println( iNum1 / (int)fNum ); // 3
		
		System.out.println((int) iNum1/fNum );// 3.3333333
		System.out.println((double)iNum1/fNum); // 3.3333333333333335
		
		System.out.println( ch2 ); // 'A'
		System.out.println((int)ch2); // 65
		System.out.println( iNum1 + ch2 ); // 75
		System.out.println((char)(ch2+iNum1)); // 'K'

	}

}
