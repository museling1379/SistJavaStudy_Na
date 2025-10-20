package day1020;

public class printf_07 {

	public static void main(String[] args) {
		// 정수 : %d	실수 : %f		문자열 : %s
		
		int num1=10,num2=20;
		int sum=num1+num2;
		
		//print
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		//printf
		System.out.printf("num1의 값은 %d이고 num2의 값은 %d이고 합계는 %d입니다",num1,num2,sum);

		/*
		 * 다음과 같이 출력(printf)를 써서하시오 \도 이용해서 한줄 내릴것
		 * 
		 * 안녕하세요 제이름은 "홍길동" 입니다
		 * 저는 "25세" 입니다
		 * 
		 */
		String name="나지예";
		int age=32;
		
		System.out.printf("\n안녕하세요 제 이름은 %s 입니다\n저는 %d세 입니다",name,age);
	}

}
