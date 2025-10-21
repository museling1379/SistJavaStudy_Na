package day1021;

public class Quiz_01 {

	public static void main(String[] args) {
		// Q.2개의 숫자를 입력하여 + - * / %를 구해봅시다
				/*
				 첫번째 숫자는? 7
				 두번째 숫자는? 3
				 ====================
				 		[결과출력]
				 두수의 합은 10 입니다
				 두수의 차이는 4 입니다
				 두수의 곱은 21 입니다
				 두수를 나누면 2 입니다
				 두수를 나누면 나머지가 1 입니다
				 */
		int a,b;
		a=7;
		b=3;
		
		System.out.println(" 첫번째 숫자는? "+a);
		System.out.println(" 두번째 숫자는? "+b);
		System.out.println("=====================");
		System.out.println("\t[결과출력]");
		System.out.println(" 두수의 합은 "+(a+b)+" 입니다");
		System.out.println(" 두수의 차이는 "+(a-b)+" 입니다");
		System.out.println(" 두수의 곱은 "+(a*b)+" 입니다");
		System.out.println(" 두수를 나누면 "+(a/b)+" 입니다");
		System.out.println(" 두수를 나누면 나머지가 "+(a%b)+" 입니다");

	}

}
