package cn.sxt.io;

import java.io.File;

public class TestIOStudy04 {
	
	public static void main(String[] args){
		filesSrc dir1=new filesSrc("F:/����"); 
		System.out.println(dir1.getLen()+"----"+dir1.getFileSize()+"----"+dir1.getFilesSize());
		filesSrc dir2=new filesSrc("F:/����/ѧУ2013"); 
		System.out.println(dir2.getLen()+"----"+dir2.getFileSize()+"----"+dir2.getFilesSize());
	}
}
  //�ļ�
class filesSrc{
	//�ļ���С
//	private static long  len=0;   //��һ�εĵõ���len�ᱣ�� ���ڶ���ִ�л���ǰ��len�Ļ����ϼ�
	private long  len=0;
	//�ļ���·��
	private String path;
	//�ļ��ĸ���
	private int fileSize=0;
	//�ļ��еĸ���
	private int filesSize=0;
	//Դ
	private File f;
	public filesSrc(String path){//���췽��
		this.path=path;
		this.f=new File(path);
		count(this.f);
	}
	public long getLen(){
		return len;
	}
	//private static void count(File f){  
	//�����ļ��Ĵ�С
	private  void count(File f){	
		if(null!=f&&f.exists()){//��Ϊ�ղ��Ҵ���
			if(f.isFile()){  //�Ƿ���һ���ļ�
				fileSize++;
			len+=f.length();
			}else{//��һ���ļ���
				filesSize++;
				for(File s:f.listFiles()){//���Ｖ
					count(s);
				}
			}
		}
	}
	public int getFileSize() {
		return fileSize;
	}
	public int getFilesSize() {
		return filesSize-1;   //������һ���ļ��У������ȥ��
	}
}