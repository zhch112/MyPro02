package cn.sxt.io;

import java.io.UnsupportedEncodingException;

public class TestDecode {

	public static void main(String[] args) throws UnsupportedEncodingException{
		String mrg="�Ұ��㣡";
		//����
		byte[] datas=mrg.getBytes();
		System.out.println(datas.length);
		//����
		mrg=new String(datas,0,datas.length,"gbk");
		System.out.println(mrg);
		
		
		//����ԭ��
		///1���ֽ�������
		mrg=new String(datas,0,datas.length-2,"gbk");
		System.out.println(mrg);
		///2���ַ�����ͳһ
		mrg=new String(datas,0,datas.length,"utf8");
		System.out.println(mrg);
	}
}