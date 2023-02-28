package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		
		/* 형변환 (Casting) : 값의 자료형을 변환하는 것 
		 * 						(단, boolean 제외 boolean 두가지만 있음) 
		 * 
		 * ** 형변환은 왜 필요할까 ?
		 * 컴퓨터는 기본적으로 같은 자료형 끼리만 연산이 가능함
		 * 다른 자료형과 연산 시 오류 발생
		 * 
		 * 자동 / 강제 형변환이 존재 
		 * 
		 * 
		 * 
		 * */
		
		// 자동 형변환 
		// - [값의 범위]가 큰 자료형과 
		//   [값의 범위]가 작은 자료형의 연산 시 
		//   작은 자료형 -> 큰 자료형으로 
		//   컴파일러에 의해 자동적으로 변환되는 것 
 		
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println(num1 + num2);
		// 원래 에러가 발생해야 되지만 "자동 형변환" 덕분에 발생하지 않음 
		// int < double double 자동 형변환
		
		
		int i1 = 3;
		double d1 = i1; // double은 실수만 저장할 수 있는 자료형 이지만
						// 정수가 대입되는 연산이 수행되면 
		
		System.out.println("i1 : " + i1); //3
		System.out.println("d1 : " + d1); //3.0
		
		System.out.println(d1 + num2); // double + double 정상적
		
		// int -> long 형변환 
		int i2 = 2_100_000_000; // 21억
		long l2 = 10_000_000_000L; // 100억
		long result2 = i2 + l2;
		// int + long -> long + long = long
		
		System.out.println("result2 : " + result2);
		
		// char 자료형을 int로 형변환
		char ch3 = 'v';
		int i3 = ch3; // 대입도 연산이다 !
				 	  // int 변수 = char 값
					  //             -> int 자동 형변환 
		
		System.out.println(i3);
		
		char ch4 = '각';
		int i4 = ch4;
		System.out.println(i4);
		
		
		// long -> float 자동 형변환 
		long l5 = 123456789123456789L;
		float f5 = l5 * 100;
		// float = long * int;
		// float = long * long
		// float = long 결과를 출력했다
		// float = float(자동 형변환)
	
		System.out.println(f5); // -6.1010652E18 (오버플로우가 됨)
		
		// 오버플로우 현상은 컴퓨터가 미리 예측할 수 없다 
		// -> 개발자가 미리 예측해야함 
		
		//(byte b1 = 128; 하면 에러나지만 대입해서 계산하면 인식못함)
		int i6 = 2147483647; // int 최대값
		int result6 = i6 + 1;
		System.out.println(result6); // -2147483648
		// double 혹은 long으로 바꿔주면 됌(값의 범위가 더 크기때문에)
		
		// byte - short - int - long - float -  double
		// char
		
		
	
		

		
		
		
		
	}
}
