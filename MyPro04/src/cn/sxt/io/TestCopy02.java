package cn.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestCopy02 {

	public static void main(String[] args){
		File f=new File("E:/Ѹ������/xuyao/10_�����̣���11����");
		//copyDocumens(f);
	}
	/*
//	File f=new File("E:/Ѹ������/xuyao/10_�����̣���11����");
	static File m=new File("E:/Ѹ������/aa");
	public static  void copyDocumens(File f){
		if(null==f||!f.exists()){
			return;
		}else if(f.isFile()){
			InputStream src=null;
			OutputStream dest=null;
		//	System.out.println(f.getName());
			try {
				src=new FileInputStream(f);
				dest=new FileOutputStream(m);
				byte[] dt1=new byte[1024];
				int len=-1;
				while((len=src.read(dt1))!=-1){
					dest.write(dt1, 0, len);
			//		String str=new String(dt1,0,len);
				}
			//	String m="";
			//	byte[] dt2=m.getBytes();
			//	dest.write(dt2);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(null!=dest){
					dest.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(null!=src){
					src.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(f.isDirectory()){
			File[] file=f.listFiles();
			for(File temp:file){
				copyDocumens(temp);
			}
		}
	}*/
}
