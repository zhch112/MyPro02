package cn.sxt.io;

import java.io.File;
/**
 * 统计文件夹大小
 * @author 喵喵了个眯
 *
 */
public class TestIOStudy {

	public static void main(String[] args){
	
		File file=new File("F:/动漫");
		count(file);
		System.out.println(len);
	}
	private static long len=0;
	public static void count(File f){
		if(null!=f&&f.exists()){//不为空并且存在
			if(f.isFile()){  //是否是一个文件
			len+=f.length();
			}else{//是一个文件夹
				for(File s:f.listFiles()){//子孙级
					count(s);
				}
			}
		}
	}
}
