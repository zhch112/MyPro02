package cn.sxt.io;

import java.io.File;
/**
 * ͳ���ļ��д�С
 * @author �����˸���
 *
 */
public class TestIOStudy {

	public static void main(String[] args){
	
		File file=new File("F:/����");
		count(file);
		System.out.println(len);
	}
	private static long len=0;
	public static void count(File f){
		if(null!=f&&f.exists()){//��Ϊ�ղ��Ҵ���
			if(f.isFile()){  //�Ƿ���һ���ļ�
			len+=f.length();
			}else{//��һ���ļ���
				for(File s:f.listFiles()){//���Ｖ
					count(s);
				}
			}
		}
	}
}
