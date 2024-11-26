package codeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// 숫자를 입력 받으면 list에 저장됨
		// 하지만 0을 입력 받으면 list에 있는 마지막 숫자가 지워짐
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int value =0;
		while(true) { // 계속 숫자를 입력 받을 수 있음
			System.out.println("숫자를 입력 하세요");
			System.out.print("입력 : ");
			int num = sc.nextInt();		
			// 만약 num이 0인 경우 list에 마지막 숫자가 지워짐
			if(num==0) {
				list.remove(0);
			}
			list.add(num);
			System.out.println("전체 숫자 : ["+list+"]");
			value += list.get(0);
			
			System.out.println("전체 숫자 합 : ["+value+"]");

		}

		// N 크기만큼의 스택 공간 형성
		
		// N 개의 데이터를 입력 받을 것임
		//	0이 아니면 그냥 스택에 저장저장
		//	0이면 데이터 제거
		
		// 마지막에 스택에 남아있는 모든 데이터 총합
		
	}
}
