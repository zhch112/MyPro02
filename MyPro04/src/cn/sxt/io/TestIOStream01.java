package cn.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ļ��ֽ�������
 * 1������Դ
 * 2��ѡ����
 * 3������
 * 4���ر�
 * 
 *�ļ��ֽ������
 *1������Դ
 *2��ѡ����
 *3������
 *4���ر�
 * @author �����˸���
 *
 */
public class TestIOStream01 {

	public static void main(String[] args){
		////�ļ��ֽ������
		//����Դ
		File f=new File("f.txt");
		//ѡ����
		//1��û���ļ����Դ���
		//2����ԭ�л����Ͽ���׷��ԭ�����ݣ�Ĭ����false
		//os=new FileOutputStream(f,true);
		OutputStream os=null;
		try {
			//����
			os=new FileOutputStream(f,false);
			String str="welcom to china";
			byte[] datas=str.getBytes();
			os.write(datas, 0, str.length());
			//ˢ��
			os.flush();
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			
			//�ͷ�
			if(null!=os)
			os.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		/**
		
		
		////�ļ��ֽ�������
		//����Դ
		File src=new File("abc.txt");
		//ѡ����
		InputStream s=null;
		try {
			//����
			s = new FileInputStream(src);
			byte[] flush=new byte[5];///�ֽ�����
			int temp=-1;//���ճ���
			while((temp=s.read(flush))!=-1){  ///���һ���ַ�����֮��Ϊ-1
				//�ֽ�����ת��Ϊ�ַ���   ------����
				String str=new String(flush,0,temp); 
				System.out.println(str);
			}
		//	int data1=s.read();
		//	System.out.println((char)data1);
		} catch (FileNotFoundException e1) {			
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			//�ر�
			if(null!=s){
				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}