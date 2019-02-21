package cn.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组输入流
 * @author 喵喵了个眯
 *
 */
public class TestArrayStream {

	public static void main(String[] args){
		//创建源------字节数组
		String str="talk is cheap show me the code";
		byte[] dt1=str.getBytes();
		//选择流
		InputStream s=null;
		s= new ByteArrayInputStream(dt1);
		byte[] bt=new byte[5];
		int len=-1;
		try {
			while((len=s.read(bt))!=-1){
				//从输入流中读取一定量的字节，并将其存储在缓冲区bt中，并以整型值返回个len
				String r=new String(bt,0,len);
				System.out.println(r);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
