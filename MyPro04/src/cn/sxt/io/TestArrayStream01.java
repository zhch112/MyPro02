package cn.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * �ֽ����������
 * @author �����˸���
 *
 */
public class TestArrayStream01 {

	public static void main(String[] args) throws IOException{
		//
		byte[] dest=null;
		//ѡ����������������
		ByteArrayOutputStream d=null;
		d=new ByteArrayOutputStream();
		//������д����
		String msg="show me the code";
		byte[] dt=msg.getBytes();//�ַ���----->�ֽ�����
		d.write(dt, 0, dt.length);
		d.flush();
		//��ȡ����
		dest=d.toByteArray();
		System.out.println(dest.length+"----->"+new String(dest,0,d.size()));
		
		System.out.println(dest.length+"----->"+new String(dest,0,dest.length));
	}
}
