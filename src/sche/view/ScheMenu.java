package sche.view;

import java.util.Scanner;

import sche.controller.FunctionControl;

public class ScheMenu {
	
	private FunctionControl f = new FunctionControl();   
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			
		f.printCalendar();
		System.out.println("====================================================");
		System.out.println("1. 일정 추가\n"
				+ "2. 일정수정\n"
				+ "3. 일정삭제\n"
				+ "0. 종료\n");
		System.out.print("번호 입력 : ");
		int mnum = sc.nextInt();
		
		switch(mnum) {
		case 1 : f.findIndex(); break;
		case 2 : break;
		case 3 : break;
		case 0 : return;
		}
		
		
		}
	}
}
