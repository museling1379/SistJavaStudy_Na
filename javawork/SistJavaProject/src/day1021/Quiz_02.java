package day1021;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		/*
		 당신의 이름은?
		 김효신
		 당신이 태어난 연도는?
		 1997
		 당신이 사는 지역은?
		 대전
		 =======================
		 [김효신 님의 개인정보]
		 지역: 대전
		 나이: 28세
		 */
		Scanner sc=new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		String name,city,myDdi;
		int myYear,age;
		int culYear=cal.get(cal.YEAR);
		
		//띠..자바에서의 로직순서는 원숭이띠
		//원숭이 닭 개 돼지 쥐 소 호랑이 토끼 용 뱀 말 양
		
		
		System.out.println("당신의 이름은?");
		name=sc.nextLine();
		System.out.println("당신이 태어난 연도는?");
		myYear=Integer.parseInt(sc.nextLine());
		age=culYear-myYear;
		System.out.println("당신이 사는 지역은?");
		city=sc.nextLine();
		System.out.println("=========================");
		System.out.println("["+name+" 님의 개인정보]");
		System.out.println("지역: "+city);
		System.out.println("나이: "+age+"세");
		
		myDdi=myYear%12==0?"원숭이":
			myYear%12==1?"닭":
				myYear%12==2?"개":
					myYear%12==3?"돼지":
						myYear%12==4?"쥐":
							myYear%12==5?"소":
								myYear%12==6?"호랑이":
									myYear%12==7?"토끼":
										myYear%12==8?"용":
											myYear%12==9?"뱀":
												myYear%12==10?"말":"양";
		
		System.out.println("나의 띠: "+myDdi+"띠");
		
	}

}
