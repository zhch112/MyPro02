package cn.sxt.io;
/**
 * list()  :�¼�����
 * listFiles():�¼�����
 * listRoots():�̷�
 * 
 */
import java.io.File;

public class TestIOStudy02 {

	public static void main(String[] args){
		File dir=new File("E:/Ѹ������/xuyao/10_�����̣���11����");
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
