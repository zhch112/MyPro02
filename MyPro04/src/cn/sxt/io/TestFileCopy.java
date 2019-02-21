package cn.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 1��ͼƬ��ȡ���ֽ�������
 * 	1)��ͼƬ----����FileInputStream
 *  2)������----�ֽ�����ByteArrayOuterputStream
 *  * @author �����˸���
 *2���ֽ�����д��ͼƬ
 * 1)���ֽ����鵽����  ByteArrayInputStream
 * 2)�������ļ�  FileOutputStream
 */
public class TestFileCopy {

	public static void main(String[] args){
	
		byte[] datas=fileToByteArray("Moment.jpg");//���÷������ļ�--�ֽ�����  ����ֵΪ�ֽ�����
		System.out.println(datas.length);
		byteArrayToFile(datas,"MM.jpg");//�ֽ�����---�ļ�
	}
	//ͼƬ-----�ֽ�����
	public static byte[] fileToByteArray(String filePath){
		
		//����Դ
		File src= new File(filePath);  //Դ�ļ�
		byte[] dest=null;//   Ŀ���ֽ�����
		//ѡ����
		InputStream is=null;   //������
		ByteArrayOutputStream it=null;    //�ֽ����������           
		try {
			is=new FileInputStream(src);//�ļ���
			it=new ByteArrayOutputStream();//�ֽ�������
			//����---���зֶζ�ȡ
			byte[] flush=new byte[1024*4];//ÿ�ζ�ȡ4k
			int len=-1;
			while((len=is.read(flush))!=-1){//���������ж�ȡһ�����ֽڣ�����洢��������flush�У���������ֵ���ظ�len
				it.write(flush, 0, len);//����ȡ��4k����д�뵽�ֽ�����it��
			}
			it.flush();
			return it.toByteArray();//��Ҫ������ֽ����鷵��
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	//�ֽ�����-----ͼƬ
	public static void byteArrayToFile(byte[] src,String filePath){
		//����Դ
		File dest=new File(filePath);   ///Ŀ�ĵ��ļ�
		//ѡ����
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new ByteArrayInputStream(src);//�ֽ�����
			os=new FileOutputStream(dest);
			//����---�ֶζ�ȡ
			byte[] flush=new byte[1024*4];//��������
			int len =-1;
			while((len=is.read(flush))!=-1){
				os.write(flush, 0, len); ///д�����ļ�
			}
			os.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
				try {
					if(null!=os){
						os.close();
					}
				} catch (IOException e) {
					e.printStackTrace();	
				}
		}
	
	}
}
