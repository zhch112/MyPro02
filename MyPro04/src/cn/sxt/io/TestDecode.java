package cn.sxt.io;

import java.io.UnsupportedEncodingException;

public class TestDecode {

	public static void main(String[] args) throws UnsupportedEncodingException{
		String mrg="我爱你！";
		//编码
		byte[] datas=mrg.getBytes();
		System.out.println(datas.length);
		//解码
		mrg=new String(datas,0,datas.length,"gbk");
		System.out.println(mrg);
		
		
		//乱码原因
		///1、字节数不够
		mrg=new String(datas,0,datas.length-2,"gbk");
		System.out.println(mrg);
		///2、字符集不统一
		mrg=new String(datas,0,datas.length,"utf8");
		System.out.println(mrg);
	}
}
