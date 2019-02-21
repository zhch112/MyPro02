package cn.sxt.io;

import java.io.File;

public class TestIOStudy04 {
	
	public static void main(String[] args){
		filesSrc dir1=new filesSrc("F:/动漫"); 
		System.out.println(dir1.getLen()+"----"+dir1.getFileSize()+"----"+dir1.getFilesSize());
		filesSrc dir2=new filesSrc("F:/动漫/学校2013"); 
		System.out.println(dir2.getLen()+"----"+dir2.getFileSize()+"----"+dir2.getFilesSize());
	}
}
  //文件
class filesSrc{
	//文件大小
//	private static long  len=0;   //第一次的得到的len会保留 ，第二次执行会在前面len的基础上加
	private long  len=0;
	//文件夹路径
	private String path;
	//文件的个数
	private int fileSize=0;
	//文件夹的个数
	private int filesSize=0;
	//源
	private File f;
	public filesSrc(String path){//构造方法
		this.path=path;
		this.f=new File(path);
		count(this.f);
	}
	public long getLen(){
		return len;
	}
	//private static void count(File f){  
	//计算文件的大小
	private  void count(File f){	
		if(null!=f&&f.exists()){//不为空并且存在
			if(f.isFile()){  //是否是一个文件
				fileSize++;
			len+=f.length();
			}else{//是一个文件夹
				filesSize++;
				for(File s:f.listFiles()){//子孙级
					count(s);
				}
			}
		}
	}
	public int getFileSize() {
		return fileSize;
	}
	public int getFilesSize() {
		return filesSize-1;   //自身是一个文件夹，被算进去了
	}
}