package work.home.at;

import java.util.Scanner;

public class OperatorPractice { //기능 제공 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		/*	모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

		[실행화면]
		인원 수 : 29
		사탕 개수 : 100
		1인당 사탕 개수 : 3
		남는 사탕 개수 : 13*/

		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 :");
		int input2 = sc.nextInt();
		
		System.out.println(input2 / input1);
		System.out.println(input2-((input2 / input1)*input1));
	
		//PracticeRun 파일에 연동하는 거 아직 서투르다
		//마지막 사칙연산을 실수했다. 좀더 고민한 후 실행할 것
		
	}

	public void practice2(){
		
		/*ex.
이름 : 홍길동
학년(정수만) : 3
반(정수만) : 4
번호(정수만) : 15
성별(남학생/여학생) : 남학생
성적(소수점 아래 둘째 자리까지) : 85.75
3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.*/
	
	System.out.print("이름 : ");	
	String name = sc.next();
	
	System.out.print("학년 : ");	
	int grade = sc.nextInt();
	
	System.out.print("반 : ");	
	int classroom = sc.nextInt(); //class는 이미 있는 용어라서 변수로 못 쓰는 듯
	
	System.out.print("번 : ");	
	int number = sc.nextInt();
	
	sc.nextLine();
	
	System.out.print("성별(남학생/여학생) :");
	String gender = sc.next();
	
	System.out.print("성적 : ");
	double score = sc.nextDouble();
	
	System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", 
			grade, classroom, number, name, gender, score);
	
	// %d 이다 #d가 아니라. 그리고 +"학년" 이런 식으로 쓰는 건 f구문이 아님
	//+ 조건식에서 %d가 하나 더 있어 오류가 발생함. 주의할 것
	}

	public void practice3(){
	/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

[실행화면]
국어 : 60
영어 : 80
수학 : 40
합계 : 180
평균 : 60.0*/
		
		System.out.print("국어 :");
	    int kor = sc.nextInt();
	    
	    System.out.print("영어 :");
	    int eng = sc.nextInt();
	    
	    System.out.print("수학 :");
	    int math = sc.nextInt();

	    int sum = kor + eng + math;  //sum = int(kor + eng + math); 이렇게 쓰니까 틀리자너.. 
	    double avg = sum/3.0;
	    		
	    System.out.println("합계 : "+ sum);		
	    System.out.printf("평균 : %.1f\n", avg);
	   
	 // 각 과목이 40점 이상이고 평균 60점이상이어야 합격
	 // 그 외 불합격 출력
	 
	boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		
		System.out.println( result ? "합격" : "불합격" );
		
	    
	}
}