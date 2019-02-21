package cn.sxt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
/**
 * 仅仅 适合字符文件
 * @author 喵喵了个眯
 *
 */
public class TestCharStream03 {

	public static void main(String[] args){
	
		File src=new File("abc.txt");
		File dest=new File("abc1.txt");
		Reader s=null;
		Writer d=null;
		
		try {
			s=new FileReader(src);
			d=new FileWriter(dest);
			char[] dt1=new char[1024];//得到一个缓冲容器
			int len=-1;
			while((len=s.read(dt1))!=-1){
				d.write(dt1, 0, len);
			}
			d.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(null!=d){
					d.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(null!=s){
					s.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
