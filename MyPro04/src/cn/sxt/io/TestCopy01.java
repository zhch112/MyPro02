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
		//����Դ
		File src=new File(spath);
		File dest=new File(dpath);
		
			//ѡ����
			InputStream s=null;
			OutputStream d=null;
			try {
				s = new FileInputStream(src);
				d=new FileOutputStream(dest);
				byte[] datas=new byte[1042];	//�����ֽ�����
				int len=-1; //���ճ���
				//��������
				while((len=s.read(datas))!=-1){  //�ֶζ�ȡ��
					//.read(byte[] b)
					//���������ж�ȡһ���������ֽڣ�������洢�ڻ���������b �У�����������ʽ����ʵ�ʶ�ȡ���ֽ�����
					
				//	String str=new String(datas,0,len);//�ֽ�����----->�ַ���
				//	System.out.println(str);
					d.write(datas,0,len);
				}
			//	String it="yayyayyayay";
				
				//.getBytes()���ǽ�String�ַ���ת�����ֽ������һ������
			//	byte[] data2=it.getBytes();  //�ַ���----->�ֽ�����
			//	d.write(data2,0,data2.length);  //д��
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{          //�ͷ�------�ȴ򿪵ĺ��ͷ�
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