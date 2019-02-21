package cn.sxt.io;
/**
 * list()  :下级名称
 * listFiles():下级对象
 * listRoots():盘符
 * 
 */
import java.io.File;

public class TestIOStudy02 {

	public static void main(String[] args){
		File dir=new File("E:/迅雷下载/xuyao/10_网络编程（共11集）");
		String[] s=dir.list();
		for(String temp:s){
			System.out.println(temp);
		}
		File[] f=dir.listFiles();
		for(File subname:f){
			System.out.println(subname.getAbsolutePath());
		}
		File[] root=dir.listRoots();
		for(File r:root){
			System.out.println(r.getAbsolutePath());
		}
	}
}
