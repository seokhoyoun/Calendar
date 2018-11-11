package seokho.youn;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		
		System.out.print("1)  ");
		int first = scanner.nextInt();
		System.out.print("2)  ");
		int second = scanner.nextInt();
		
		int sum = first + second;
		
		System.out.println("두 수의 합 :  "+sum);
	}
}