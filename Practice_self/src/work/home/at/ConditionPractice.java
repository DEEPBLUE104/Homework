package work.home.at;

import java.util.Scanner;

public class ConditionPractice { //기능 작성 클래스
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		/*키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
짝수가 아니면 “홀수입니다.“를 출력하세요.
양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

[실행 화면 1]
숫자를 한 개 입력하세요 : 8
짝수입니다.

[실행 화면 2]
숫자를 한 개 입력하세요 : 17
홀수입니다.

[실행 화면 3]
숫자를 한 개 입력하세요 : -3
양수만 입력해주세요.*/
		
		System.out.println("숫자를 한 개 입력하세요.");
		int num = sc.nextInt();
		
		String result;
		if(num<0) { result = "양수만 입력해주세요.";
		} 
		
	}
	
}
