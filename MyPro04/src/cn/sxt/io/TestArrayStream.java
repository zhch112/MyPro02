package cn.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * �ֽ�����������
 * @author �����˸���
 *
 */
public class TestArrayStream {

	public static void main(String[] args){
		//����Դ------�ֽ�����
		String str="talk is cheap show me the code";
		byte[] dt1=str.getBytes();
		//ѡ����
		InputStream s=null;
		s= new ByteArrayInputStream(dt1);
		byte[] bt=new byte[5];
		int len=-1;
		try {
			while((len=s.read(bt))!=-1){
				//���������ж�ȡһ�������ֽڣ�������洢�ڻ�����bt�У���������ֵ���ظ�len
				String r=new String(bt,0,len);
				System.out.println(r);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
