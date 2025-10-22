package day1022;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		/* 오늘 입고된 상품명은?
		  갤럭시 폴드
		  입고된 수량은?
		  5
		  단가는?
		  1200000
		  
		  갤럭시폴드 5개는 총 6000000입니다
		  5개 이상은 10프로 DC됨
		  할인된 총금액: 5400000원
		 */
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int num,price;
		
		
		
		
		
		
		
		System.out.print("오늘 입고된 상품명은?");
		name=sc.nextLine();
		System.out.println(name);
		System.out.print("입고된 수량은?");
		num=sc.nextInt();
		System.out.println(num);
		System.out.print("단가는?");
		price=sc.nextInt();
		System.out.println(price);
		
		System.out.println(name+num+"개는 총 "+(num*price)+"원 입니다");
		if (num>=5) {
			int final_price=((price/10)*num)*9;
			System.out.println("5개 이상은 10프로 할인 됩니다");
			System.out.println("할인된 총금액: "+final_price+"원");
		}
		else 
			System.out.println("총 금액: "+(price*num)+"원");
		

	}

}
