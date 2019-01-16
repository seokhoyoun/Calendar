package sche.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FunctionControl implements IFunction{

	@Override
	public void addSchedule(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifySchedule(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delSchedule(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int findIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printCalendar() {
		Calendar now = Calendar.getInstance();
		now.set(Calendar.DATE, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("MMM");
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

}
