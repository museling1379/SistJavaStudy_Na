package day1021;

import java.util.Scanner;

public class ScanTest_09 {

	public static void main(String[] args) {
		/* 점수는 int자료형으로 하십시오
		 이름입력: 홍길동
		 점수: 88
		 학년: 4
		 [결과출력]
		 홍길동님은 4학년이며 평점은 88점 입니다
		 */
		Scanner sc=new Scanner(System.in);
		
		String name,grade;
		int score;
		
		name=sc.nextLine();
		grade=sc.nextLine();
		score=Integer.parseInt(sc.nextLine());
		
		
		System.out.println("이름입력: "+name);
		System.out.println("점수: "+score);
		System.out.println("학년: "+grade);
		System.out.println("=========================================");
		System.out.println(name+"님은 "+grade+"학년이며 평점은 "+score+"점 입니다");

	}

}
