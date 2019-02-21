package cn.sxt.oop;

import java.io.File;

public class TestFile {

	public static void main(String[] args){
		
		File f=new File("E:\\迅雷下载");
		FilePrint(f,0);
	}
	public static void FilePrint(File file,int level) {
		for(int i=0;i<level;i++){
			System.out.print("-");
		}
		System.out.println(file.getName());//得到文件的名称
		if(file.isDirectory()){    //判断文件是否有子目录
			System.out.println("#################################################");
			File[] files=file.listFiles();  ///将子目录给数组对象
			for(File temp:files){   //列出数组中的元素
				FilePrint(temp,level+1);
			}
		}
		
	}
}
