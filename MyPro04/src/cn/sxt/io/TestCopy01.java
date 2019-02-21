package cn.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestCopy01 {

	public static void main(String[] args){
		String spath="Moment.jpg";
		String dpath="al.jpg";
		copyTest(spath,dpath);
	}
	public static void copyTest(String spath,String dpath){
		//创建源
		File src=new File(spath);
		File dest=new File(dpath);
		
			//选择流
			InputStream s=null;
			OutputStream d=null;
			try {
				s = new FileInputStream(src);
				d=new FileOutputStream(dest);
				byte[] datas=new byte[1042];	//定义字节数组
				int len=-1; //接收长度
				//缓冲容器
				while((len=s.read(datas))!=-1){  //分段读取，
					//.read(byte[] b)
					//从输入流中读取一定数量的字节，并将其存储在缓冲区数组b 中，并以整数形式返回实际读取的字节数。
					
				//	String str=new String(datas,0,len);//字节数组----->字符串
				//	System.out.println(str);
					d.write(datas,0,len);
				}
			//	String it="yayyayyayay";
				
				//.getBytes()就是将String字符串转换成字节数组的一个方法
			//	byte[] data2=it.getBytes();  //字符串----->字节数组
			//	d.write(data2,0,data2.length);  //写入
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{          //释放------先打开的后释放
				try {
					if(null!=d){
						d.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					if(null!=s){
						s.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	
	}
}
