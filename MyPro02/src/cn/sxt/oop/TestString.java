package cn.sxt.oop;

public class TestString {
	public static void main(String[] args){
		String str1="gaoqi";
		String str2="gaoqi";/////常量池
		String str3=new String("gaoqi");
		System.out.println(str1==str2);
		System.out.println(str1==str3);//str1/str2和str3不是同一个对象
	
	////通常比较字符串时，使用equals
		System.out.println(str1.equals(str3));
	
	}
}
