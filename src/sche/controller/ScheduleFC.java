package sche.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

import sche.model.vo.Schedule;

public class ScheduleFC implements ISchedule{
	
	Scanner sc = new Scanner(System.in);
	HashMap<String,Schedule> hm = new HashMap<>();
	
	@Override
	public void addSchedule(String index) {
		System.out.println("일정 제목 입력 : ");
		String title = sc.nextLine();
		System.out.println("일정 시간 입력 : ");
		String time = sc.nextLine();
		System.out.println("일정 내용을 입력해주세요 (종료:exit)");
		StringBuilder sb = new StringBuilder();
		String line = null;
		while(!(line = sc.nextLine()).equals("exit")) {
			sb.append(line);
		}
		hm.put(index, new Schedule(title, sb.toString(),time));
		
	}

	@Override
	public void modifySchedule(String index) {
		
	}

	@Override
	public void delSchedule(String index) {
		
	}

	public void printSchedule() {
	/*	System.out.println("일정 : "+hm.get(index).getTitle());
		System.out.println("시간 : "+hm.get(index).getTime());
		System.out.println("내용 : "+hm.get(index).getText());*/
		
		
	}
	
	public void fileSave() {
		System.out.println("저장할 파일 이름 : ");
		String fTitle = sc.next();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fTitle+".dat")));
			oos.writeObject(hm);
			System.out.println(fTitle+".dat 파일 저장이 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	
	
		
		
	

}
