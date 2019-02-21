package cn.sxt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * 字符输入流
 * @author 喵喵了个眯
 *
 */
public class TestCharStream {

	public static void main(String[] args){
		charStream();
	}
	public static void charStream(){
		//创建源
		File src=new File("abc1.txt");
		Reader reader=null;  //选择字符输入流
		try {
			reader=new FileReader(src);
			char[] dt1=new char[1024];//  字符----->字符数组
			int len=-1;  //接收长度
			while((len=reader.read(dt1))!=-1){
				//.read(char[] b)
				//从输入流中读取一定数量的字符，并将其存储在缓冲区数组b 中，并以整数形式返回实际读取的字符数。
				String str=new String(dt1,0,len);  //字符数组----->字符串
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(null!=reader){
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
