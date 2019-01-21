package sche.view;

import java.util.Scanner;

import sche.controller.CalendarFC;
import sche.controller.ScheduleFC;

public class ScheMenu {
	
	private ScheduleFC s = new ScheduleFC();
	private CalendarFC c = new CalendarFC();
	Scanner sc = new Scanner(System.in);
	static int count = 0; 
	
	public void mainMenu() {
		c.printCalendar();
		
		while(true) {
			System.out.println("====================================================");
			System.out.println("1. 일정 추가\n"
				+ "2. 일정 수정\n"
				+ "3. 일정 삭제\n"
				+ "4. 전체 일정 조회\n"
				+ "5. 출력 월 변경\n"
				+ "6. 파일 저장하기\n"
				+ "7. 파일 불러오기\n"
				+ "0. 종료\n");
		System.out.print("번호 입력 : ");
		int mnum = sc.nextInt();
		
		switch(mnum) {
		case 1 : s.addSchedule(c.chooseDate()); break;
		case 2 : s.modifySchedule(c.chooseDate());break;
		case 3 : s.delSchedule(c.chooseDate());break;
		case 4 : s.printSchedule(); break;
		case 5 : c.switchCalendar(); break;
		case 6 : s.fileSave(); break;
		case 7 : s.fileLoad(); break;
		case 0 : return;
		}
		
		
		}
	}
}
