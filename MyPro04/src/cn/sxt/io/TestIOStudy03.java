package cn.sxt.io;

import java.io.File;

public class TestIOStudy03 {

	public static void main(String[] args){
		File file=new File("F:/动漫");
		PrintFile(file,0);
	}
	public static void PrintFile(File f,int deep){
	//	System.out.println(f.getName());
		for(int i=0;i<deep;i++){
			System.out.print("-");
		}
		//打印名称
		System.out.println(f.getName());
		if(null==f||!f.exists()){
			return;
		}else if(f.isDirectory()) {  //是否有子目录
			for(File s:f.listFiles()){ // 列出目录
				//System.out.println(s.getName());
				PrintFile(s,deep+1);
			}
		}
	}
}
