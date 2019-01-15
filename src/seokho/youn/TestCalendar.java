package seokho.youn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TestCalendar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년' MM'월' dd'일'");
		
		Calendar now = Calendar.getInstance();
		System.out.println("오늘은 "+sdf.format(now.getTime())+" 입니다");
		System.out.print("year : ");
		String year = sc.next();
		System.out.print("month : ");
		String month = sc.next();
		System.out.print("day : ");
		String day = sc.next();
		

		/*now.set(now.YEAR, Integer.parseInt(year));
		now.set(now.MONTH, Integer.parseInt(month)-1);
		now.set(now.DATE, Integer.parseInt(day));*/
		now.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
		
		System.out.println(now.getTime());
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		
		System.out.println("SUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		
		
		/*int months = 0; int days = 30;
		while(months != -1){
			System.out.println("달을 입력하세요");
			months = scanner.nextInt(); 
			
			
			
			if(months==1||months==3||months==5||months==7||months==8||months==10||months==12) {
				
				days = 31;
				System.out.print("SU MO TU WE TH FR SA\r\n" + 
						"--------------------\r\n" + 
						" 1  2  3  4  5  6  7\r\n" + 
						" 8  9 10 11 12 13 14\r\n" + 
						"15 16 17 18 19 20 21\r\n" + 
						"22 23 24 25 26 27 28\r\n" + 
						"29 30 31 \n");
			}
			else if(months==2) {
				System.out.print("SU MO TU WE TH FR SA\r\n" + 
						"--------------------\r\n" + 
						" 1  2  3  4  5  6  7\r\n" + 
						" 8  9 10 11 12 13 14\r\n" + 
						"15 16 17 18 19 20 21\r\n" + 
						"22 23 24 25 26 27 28\n");
				days = 28;
			}
			else if(months==-1) {
				System.out.println("have a nice day!");
				break;
			}
			else {
				System.out.print("SU MO TU WE TH FR SA\r\n" + 
						"--------------------\r\n" + 
						" 1  2  3  4  5  6  7\r\n" + 
						" 8  9 10 11 12 13 14\r\n" + 
						"15 16 17 18 19 20 21\r\n" + 
						"22 23 24 25 26 27 28\r\n" + 
						"29 30");
			}
		}*/
					
			
	}
}