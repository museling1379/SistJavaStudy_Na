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
		
		String name,city;
		int myYear,age;
		int culYear=cal.get(cal.YEAR);
		
		
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
		
	}

}
