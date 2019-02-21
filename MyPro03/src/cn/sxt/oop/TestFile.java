package cn.sxt.oop;

import java.io.File;

public class TestFile {

	public static void main(String[] args){
		
		File f=new File("E:\\Ѹ������");
		FilePrint(f,0);
	}
	public static void FilePrint(File file,int level) {
		for(int i=0;i<level;i++){
			System.out.print("-");
		}
		System.out.println(file.getName());//�õ��ļ�������
		if(file.isDirectory()){    //�ж��ļ��Ƿ�����Ŀ¼
			System.out.println("#################################################");
			File[] files=file.listFiles();  ///����Ŀ¼���������
			for(File temp:files){   //�г������е�Ԫ��
				FilePrint(temp,level+1);
			}
		}
		
	}
}