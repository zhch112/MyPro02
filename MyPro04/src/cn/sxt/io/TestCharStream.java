package cn.sxt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * �ַ�������
 * @author �����˸���
 *
 */
public class TestCharStream {

	public static void main(String[] args){
		charStream();
	}
	public static void charStream(){
		//����Դ
		File src=new File("abc1.txt");
		Reader reader=null;  //ѡ���ַ�������
		try {
			reader=new FileReader(src);
			char[] dt1=new char[1024];//  �ַ�----->�ַ�����
			int len=-1;  //���ճ���
			while((len=reader.read(dt1))!=-1){
				//.read(char[] b)
				//���������ж�ȡһ���������ַ���������洢�ڻ���������b �У�����������ʽ����ʵ�ʶ�ȡ���ַ�����
				String str=new String(dt1,0,len);  //�ַ�����----->�ַ���
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
