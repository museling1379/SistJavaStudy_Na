package day1020;

public class ArgsVar_06 {

	public static void main(String[] a) {
		/* 매개변수를 이용하여 다음과 같이 출력
		 학생명: ***
		 자바점수: **점
		 오라클점수: **점
		 두 과목의 함계는 **점 입니다
		 */
		
		//변수선언
		String stuName=a[0];
		String java=a[1];
		String oracle=a[2];
		
		//출력
		System.out.println("학생명: "+stuName);
		System.out.println("자바점수: "+java);
		System.out.println("오라클점수: "+oracle);
		int jav=Integer.parseInt(java);
		int ora=Integer.parseInt(oracle);
		System.out.println("두 과목의 합계는 "+(jav+ora)+"점 입니다");

	}

}
