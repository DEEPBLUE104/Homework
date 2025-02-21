package work.home.at;

public class CastingPractice1 {
	
	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		// 이번에 다시 풀며 실수한 점
		// 강제 형변환은 int(iNum1)이 아니라 
		// (int)Num1 이라는 점! 
		
		System.out.println( iNum1 / iNum2 ) ; // 2
	
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		
		
		System.out.println((double) iNum1 ); // 10.0
		
		System.out.println( (double) iNum1 / iNum2 ); // 2.5
		
		System.out.println( dNum ); // 2.5
		
		System.out.println((int) fNum ); // 3
		
		System.out.println( (int)(iNum1 /fNum) ); // 3
		
		System.out.println( iNum1 /fNum );// 3.3333333
		
		System.out.println( (double) iNum1 /fNum ); // 3.3333333333333335 
		
		// double : 소수점 아래 16번째 자리까지 연산 후 반올림
		// double은 52비트까지 저장할 수 있어서 
		// 더 많은 자리수를 정확히 표현할 수 있다 ->  정밀도가 높아 마지막 값이 5
		
	
		System.out.println( ch ); // 'A'
		
		System.out.println( (int) ch); // 65
		
		System.out.println( ch + iNum1 ); // 75
		
		System.out.println( (char)(ch + iNum1) ); // 'K'

}
}