package codeUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Scholl {
/*
코이 초등학교에 새로 부임하신 교장선생님은 어린 학생들의 행복감과 학생들의 성적 차이 관계를 알아보기로 했다.

그래서 이전 성적을 조사하여 학생들의 시험 점수 차이 변화를 알아보려고 한다.

예를 들어서 2016년 학생 8명의 점수가 다음과 같다고 하자.
27,35,92,75,42,53,29,87

그러면 가장 높은 점수는 92점이고 가장 낮은 점수는 27점이므로 점수의 최대 차이는 65이다.

한편 2017년 학생 8명의 점수가 다음과 같았다.

85,42,79,95,37,11,72,32

이때 가장 높은 점수는 95점이고 가장 낮은 점수는 11점이므로 점수의 최대 차이는 84이다.
N명 학생들의 점수가 주어졌을 때, 가장 높은 점수와 가장 낮은 점수의 차이를 구하는 프로그램을 작성하시오.
 */
	public static void main(String[] args) {
		// 학생들의 점수를 리스트로 직접 입력받아서
		// a - b 를 한다
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 총 수를 입력 : ");
		int school = sc.nextInt();
		// 학생의 수를 받아와서
		for(int i=0; i<school; i++) {// 학생의 수 만큼 반복시켜서 점수를 입력 받음
			System.out.print("학생의 점수 입력 : ");
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("학생의 전체 점수 = ["+list+"]");
		// 가장 큰값
		int max = Collections.max(list);
		System.out.println("가장 높은 점수 = ["+max+"]");
		// 가장 작은 값
		int min = Collections.min(list);
		System.out.println("가장 낮은 점수 = ["+min+"]");
		// 큰값 - 작은값
		int value = max - min;
		System.out.println("점수 차이 = ["+value+"]");
	}
}
