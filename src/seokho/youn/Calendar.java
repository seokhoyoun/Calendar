package seokho.youn;

import java.util.Scanner;

public class Calendar {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int months = 0; int days = 30;
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
						"22 23 24 25 26 27 28");
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
		}
					
			
	}
}