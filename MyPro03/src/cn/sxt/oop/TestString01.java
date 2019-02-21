package cn.sxt.oop;

public class TestString01 {

	public static void main(String[] args){
		String str="abcdef";
		String str1=str.substring(2,4);
		System.out.println(Integer.toHexString(str.hashCode()));
		//hashCode();这里调用的是object的hashCode()方法,就是返回用该对象的内部地址转换成的一个整数.
		//toHexString();就是把这个整数转化成16进制!
		System.out.println(Integer.toHexString(str1.hashCode()));
		System.out.println("####################");
		
		//说明str与str1是两个不同的对象
		
		
		///StringBuilder  StringBudder  可变字符序列
		StringBuilder s=new StringBuilder("abcdef");
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(s);
		s.setCharAt(2, 'M');
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.print(s);
		
		///同一个地址
	}
}
