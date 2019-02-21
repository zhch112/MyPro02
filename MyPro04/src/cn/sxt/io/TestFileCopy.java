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
 * 1、图片读取到字节数组中
 * 	1)、图片----程序FileInputStream
 *  2)、程序----字节数组ByteArrayOuterputStream
 *  * @author 喵喵了个眯
 *2、字节数组写出图片
 * 1)、字节数组到程序  ByteArrayInputStream
 * 2)、程序到文件  FileOutputStream
 */
public class TestFileCopy {

	public static void main(String[] args){
	
		byte[] datas=fileToByteArray("Moment.jpg");//调用方法：文件--字节数组  返回值为字节数组
		System.out.println(datas.length);
		byteArrayToFile(datas,"MM.jpg");//字节数组---文件
	}
	//图片-----字节数组
	public static byte[] fileToByteArray(String filePath){
		
		//创建源
		File src= new File(filePath);  //源文件
		byte[] dest=null;//   目的字节数组
		//选择流
		InputStream is=null;   //输入流
		ByteArrayOutputStream it=null;    //字节数组输出流           
		try {
			is=new FileInputStream(src);//文件流
			it=new ByteArrayOutputStream();//字节数组流
			//操作---进行分段读取
			byte[] flush=new byte[1024*4];//每次读取4k
			int len=-1;
			while((len=is.read(flush))!=-1){//从输入流中读取一定的字节，将其存储到缓冲区flush中，并以整型值返回给len
				it.write(flush, 0, len);//将读取的4k内容写入到字节数组it中
			}
			it.flush();
			return it.toByteArray();//需要将这个字节数组返回
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	//字节数组-----图片
	public static void byteArrayToFile(byte[] src,String filePath){
		//创建源
		File dest=new File(filePath);   ///目的地文件
		//选择流
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new ByteArrayInputStream(src);//字节数组
			os=new FileOutputStream(dest);
			//操作---分段读取
			byte[] flush=new byte[1024*4];//缓冲容器
			int len =-1;
			while((len=is.read(flush))!=-1){
				os.write(flush, 0, len); ///写出到文件
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
