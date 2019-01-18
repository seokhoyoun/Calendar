package sche.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarFC implements ICalendar{

	Calendar now = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void printCalendar() {
		
		now.set(Calendar.DATE, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY'년 'MMM");
		System.out.println(sdf.format(now.getTime()));
		String[][] drr = new String[6][7];
		
		int lastday = now.getActualMaximum(Calendar.DATE);
		int count = 1;
		int dd = 1;
		for(int i = 0; i < drr.length; i++) {
			for(int j = 0; j < drr[i].length; j++) {
				if(count++ < now.get(Calendar.DAY_OF_WEEK)) 
					drr[i][j] = " ";
				else if(dd > lastday) 
					drr[i][j] = " ";
				else 
					drr[i][j] = String.valueOf(dd++);
			}
		}
		
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		for(int i = 0; i <drr.length; i++) {
			for(int j = 0; j < drr[i].length; j++) {
				System.out.print(drr[i][j]+"\t");
			}System.out.println();
		}
	}
	@Override
	public void switchCalendar() {
		
		System.out.print("YEAR : ");
		int year = sc.nextInt();
		System.out.print("MONTH : ");
		int month = sc.nextInt();
		System.out.println();
		now.set(Calendar.YEAR, year);
		now.set(Calendar.MONTH, month-1);
		printCalendar();
	}
	@Override
	public String chooseDate() {
		String year = String.valueOf(now.get(Calendar.YEAR));
		String month = String.valueOf(now.get(Calendar.MONTH)+1);
		System.out.println(month+"월 1일 부터 ~ "+now.getActualMaximum(Calendar.DATE)+"일 사이의 날짜를 입력하세요 : ");
		int date = sc.nextInt();
		return year+month+String.valueOf(date);
	}

}
