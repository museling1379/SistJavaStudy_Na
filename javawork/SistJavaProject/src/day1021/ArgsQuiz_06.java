package day1021;

public class ArgsQuiz_06 {

	public static void main(String[] args) {
		// 변수는 알아서.. 국어,영어,수학 점수를 매개변수로 입력후
		// 총점과 평균을 구하시오
		// 단 평균은 소수점 2자리로 구할것
		/*
		 이름: 홍길동 
		 국어점수: **점
		 수학점수: **점
		 영어점수: **점
		 총점: ***점
		 평균: **.**점
		 */

		String name=args[0];
		int kor=Integer.parseInt(args[1]);
		int eng=Integer.parseInt(args[2]);
		int math=Integer.parseInt(args[3]);
		int tot=kor+eng+math;
		double avg=tot/3.0;
		
		System.out.println("이름: "+name);
		System.out.println("국어점수: "+kor+"점");
		System.out.println("수학점수: "+math+"점");
		System.out.println("영어점수: "+eng+"점");
		System.out.println("총점: "+tot+"점");
		System.out.printf("평균: %.2f점",avg);
		
	}

}
