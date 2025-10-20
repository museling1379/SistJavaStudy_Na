package day1020;

public class Quiz {

	public static void main(String[] args) {
		// args라는 매개변수 이용할것!!
		//변수는 마음대로 하되 이름에 걸맞게 만들것
		/*
		 * 오늘의 퀴즈
		 * ==================
		 * 상품명: 아이폰17
		 * 수량: 2개
		 * 가격: 1500000원
		 * 총금액: 3000000원
		 */
		
		//1.변수선언
		
		//2.계산
		
		//3.출력
		String name=args[0];
		String num=args[1];
		String price=args[2];
		
		System.out.println("오늘의 퀴즈");
		System.out.println("=====================");
		System.out.println("상품명: "+name);
		System.out.println("수량: "+args[1]+"개");
		System.out.println("가격: "+args[2]+"원");
		int num1=Integer.parseInt(num);
		int price1=Integer.parseInt(price);
		System.out.println("총금액: "+(num1*price1)+"원");

	}

}
