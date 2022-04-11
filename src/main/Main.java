package main;

import calc.Calculator;
import calc.Substract;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("로컬 저장소 사용");
		System.out.println("원격 저장소 사용 가능");
		System.out.println("두번째 원격 저장 테스트");
		
		System.out.println("팀원 1");
		System.out.println("팀원 2");
		System.out.println("팀원 3");
		
		
		System.out.println("팀장 새 코드 시작");
		System.out.println("팀장 새 코드 끝");
		System.out.println("팀장 새 코드 끝");
		
		
		Calculator cal = new Calculator();
		
		
		int addResult = cal.add(1, 2);
		
		System.out.println(addResult);
		
		Substract sub = new Substract();
		
		int result = sub.subs(3, 2);
		
		System.out.println(result);
		
		
		
		System.out.println("집에서 작업 시작");
		System.out.println("집에서 작업 끝");
		
	}

}
