package sche.controller;

public interface IFunction {
	
	public void addSchedule(int index);
	
	public void modifySchedule(int index);
	
	public void delSchedule(int index);
	
	public int findIndex();
	
	public void printCalendar();
}
