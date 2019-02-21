package cn.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 字节数组输出流
 * @author 喵喵了个眯
 *
 */
public class TestArrayStream01 {

	public static void main(String[] args) throws IOException{
		//
		byte[] dest=null;
		//选择流（新增方法）
		ByteArrayOutputStream d=null;
		d=new ByteArrayOutputStream();
		//操作（写出）
		String msg="show me the code";
		byte[] dt=msg.getBytes();//字符串----->字节数组
		d.write(dt, 0, dt.length);
		d.flush();
		//获取数据
		dest=d.toByteArray();
		System.out.println(dest.length+"----->"+new String(dest,0,d.size()));
		
		System.out.println(dest.length+"----->"+new String(dest,0,dest.length));
	}
}
