package cn.sxt.oop;

public class TestString {
	public static void main(String[] args){
		String str1="gaoqi";
		String str2="gaoqi";/////������
		String str3=new String("gaoqi");
		System.out.println(str1==str2);
		System.out.println(str1==str3);//str1/str2��str3����ͬһ������
	
	////ͨ���Ƚ��ַ���ʱ��ʹ��equals
		System.out.println(str1.equals(str3));
	
	}
}
