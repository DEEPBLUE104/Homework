package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main(String[] args) {
	
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); // 2
			//처음부터 int형이라 나눠도 소수점자리x
		
		System.out.println((int)dNum); // 2 정답
		 	//정수형 int하면 소수점 x
		
		System.out.println( iNum2 * dNum ); // 10.0 
			//4 * 2.5 > 자동형변환 = 10.0
		
		System.out.println((double)iNum1); // 10.0 정답
			//double 형으로 소수점 
		
		System.out.println((double) iNum1 / iNum2 );
		System.out.println( iNum1 / (float) iNum2 ); // 물어보잠
		
		System.out.println( dNum ); // 2.5 정답
		
		System.out.println((int)fNum); // 3 정답
		System.out.println( iNum1 / (int)fNum ); // 3
		//3.0f -> 3으로 바꾸면 10 / 3은 3.3333으로 나오고 int로 대입되니까 정수만 남는다.
		
		//					10 / 3.0f
		System.out.println( iNum1/fNum );// 3.3333333
		//float : 소수점 아래 8번째 짜리까지 연산 후 반올림
		//float은 23비트까지만 저장할 수 있어서 
		//근사값이 빨리 끊어지고 반올림 > 정밀도가 낮아 마지막 값이 3으로 출력되는 경우가 있다.
		
		System.out.println( iNum1/(double)fNum ); // 3.3333333333333335
		//double : 소수점 아래 16번째 자리까지 연산 후 반올림
		//double은 53비트까지 저장할 수 있어서 
		//더 많은 자리수를 정확히 표현할 수 있다 > 정밀도가 높아 마지막 값이 5
		
		//double 비트 수: 64비트
		// > 저장 방식 52비트(가수) + 11비트 (지수) + 1비트 (부호)
		
		// float 비트 수 : 32 비트
		// > 저장 방식 23비트(가수) + 8비트 (지수) + 1비트 (부호)
		
		
		System.out.println("'"+ ch +"'"); // 'A'
		System.out.println((int) ch); // 65
		System.out.println( iNum1 + ch ); // 75
		System.out.println("'"+(char)(ch + iNum1)+"'"); // 'K'

	}

}
