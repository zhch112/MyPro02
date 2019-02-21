package cn.sxt.oop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {

	public static void main(String[] args){
		FileReader reader=null;
	try {
		reader=new FileReader("E:\\Ѹ������\\xuyao\\b.txt");
		System.out.println("step1");
		char c=(char)reader.read();
	} catch (FileNotFoundException e) {
		System.out.println("step2");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("step3");
		e.printStackTrace();
	}finally{
		System.out.println("step4");
		try {
			if(reader!=null){
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
	}
}