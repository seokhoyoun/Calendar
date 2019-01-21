package sche.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import sche.model.vo.Schedule;

public class ScheduleFC implements ISchedule{
	
	Scanner sc = new Scanner(System.in);
	HashMap<String,Schedule> hm = new HashMap<>();
	ArrayList<String> keys = new ArrayList<String>();
	
	public Schedule putData() {
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
		return new Schedule(title,sb.toString(),time);
	}
	
	@Override
	public void addSchedule(String index) {
		
		Schedule sd = putData();
		for(int i = 1; i < 100; i++) {
			if(!(hm.containsKey(index+String.format("%02d", i)))) {
				hm.put(index+String.format("%02d", i), sd);
				keys.add(index+String.format("%02d", i));
				break;
			}
		}
	}

	@Override
	public void modifySchedule(String index) {
		printSchedule(index);
		System.out.println("변경 할 일정 번호 입력 : ");
		String mnum = sc.next();
		sc.nextLine();
		if(hm.containsKey(mnum)) {
			Schedule sd = putData();
			hm.put(mnum, sd);
		}
		else
			System.out.println("해당 번호는 없습니다.");
		
	}

	@Override
	public void delSchedule(String index) {
		printSchedule(index);
		System.out.println("삭제 할 일정 번호 입력 : ");
		String mnum = sc.next();
		if(hm.containsKey(mnum)) {
			hm.remove(mnum);
			keys.remove(mnum);
			System.out.println("삭제가 완료되었습니다.");
		}
		else
			System.out.println("해당 번호는 없습니다.");
	}

	public void printSchedule() {
		keys.sort(new AscDate());
		for(Iterator<String> it2 = keys.iterator(); it2.hasNext();) {
			String key = it2.next();
			System.out.println("Sche. NO : " + key);
			System.out.println("TO DO : "+hm.get(key).getTitle());
			System.out.println("TIME : "+hm.get(key).getTime());
			System.out.println("COMMENT : "+hm.get(key).getText()+"\n");
		}
		
	}
	
	public void printSchedule(String index) {
		keys.sort(new AscDate());
		for(Iterator<String> it2 = keys.iterator(); it2.hasNext();) {
			String key = it2.next();
			if(key.substring(0, 8).contains(index)) {
			System.out.println("Sche. NO : " + key);
			System.out.println("TO DO : "+hm.get(key).getTitle());
			System.out.println("TIME : "+hm.get(key).getTime());
			System.out.println("COMMENT : "+hm.get(key).getText()+"\n");
			}
		}
	}
	
	

	
	
		
		
	

}
