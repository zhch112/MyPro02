package cn.sxt.io;

import java.io.File;
import java.io.IOException;

public class TestIOStudy01 {

	public static void main(String[] args) throws IOException{
		File f=new File("Ñ¸À×ÏÂÔØ\\a.txt");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		File f2=new File("b.txt");
		boolean b=f2.createNewFile();
		System.out.println(b);
		f2.delete();
		
	}
}
