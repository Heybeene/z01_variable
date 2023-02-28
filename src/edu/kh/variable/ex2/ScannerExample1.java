package edu.kh.variable.ex2;

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문 
// -> 설계도가 없으면 스캐너를 생성할 수 없기 때문에 
import java.util.Scanner;
// import 넣어주니 17번에 생긴 오류가 사라짐 

public class ScannerExample1 {

	public static void main(String [] agrs) {
		
		
		// Scanner: 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할 
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는 것 
		Scanner sc = new Scanner(System.in);
		// 오류의 원인 -> 만들고 싶은데 설계도가 없기 때문에(설계도 = class) 못 만들고 있음
		// -> import 구문 작성 시 오류 해결 가능 
		
		System.out.print("정수 1 입력 : ");
		
		int input1 = sc.nextInt(); // 입력 받은 정수를 input1에 대입 
		// nextInt() : 다음에 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		// print를 썼는데 왜 다음줄로 안 내려가나요 next 구문 때문이다. 
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
		
		
	
		
		
		
		
	}
}
