package cn.sxt.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * 文件字符输出流
 * @author 喵喵了个眯
 * //乱码原因
 * 1、字节数不够
 * 采用字符流------防止乱码
 * 2、字符集不统一
 */
public class TestCharStream02 {

	public static void main(String[] args){
		File dest=new File("abc1.txt");
		Writer d=null;
		try {
			d=new FileWriter(dest);
			String str="2019全国研究生等级考试yayayy";
		//	char[] dt2=str.toCharArray();//字符串------>字符数组
		//	d.write(dt2, 0, dt2.length);
		//	d.flush();

			d.write(str);
			d.append("nanan").append("你还是SCE");		//用于增加字符串
			d.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if(null!=d){
				d.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
