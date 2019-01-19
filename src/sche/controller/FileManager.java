package sche.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileManager {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void fileSave() {
		System.out.println("저장할 파일 이름 : ");
		String fTitle = sc.next();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fTitle+".dat")));
//			oos.writeObject(hm);
			System.out.println(fTitle+".dat 파일 저장이 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
