package cn.sxt.io;

import java.io.File;

public class TestIOStudy03 {

	public static void main(String[] args){
		File file=new File("F:/����");
		PrintFile(file,0);
	}
	public static void PrintFile(File f,int deep){
	//	System.out.println(f.getName());
		for(int i=0;i<deep;i++){
			System.out.print("-");
		}
		//��ӡ����
		System.out.println(f.getName());
		if(null==f||!f.exists()){
			return;
		}else if(f.isDirectory()) {  //�Ƿ�����Ŀ¼
			for(File s:f.listFiles()){ // �г�Ŀ¼
				//System.out.println(s.getName());
				PrintFile(s,deep+1);
			}
		}
	}
}
