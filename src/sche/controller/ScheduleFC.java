package sche.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
	
		ArrayList<String> keys = new ArrayList<String>();;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			keys.add(it.next());
		}
		keys.sort(new AscDate());
		for(Iterator<String> it2 = keys.iterator(); it2.hasNext();) {
			String key = it2.next();
			System.out.println("TO DO : "+hm.get(key).getTitle());
			System.out.println("TIME : "+hm.get(key).getTime());
			System.out.println("COMMENT : "+hm.get(key).getText());
		}
		
	}
	
	
	

	
	
		
		
	

}
