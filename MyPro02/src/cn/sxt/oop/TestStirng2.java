package cn.sxt.oop;

public class TestStirng2 {
	public static void main(String[] args){
		String s1="core java";
		String s2="Core java";
		System.out.println(s1.charAt(3));//提取下标为3的字符
		System.out.println(s1.equalsIgnoreCase(s2));//比较两个字符串（忽略大小写）
		System.out.println(s1.indexOf("java"));//字符串s1中是否包含java
		String s=s1.replace(' ', '&');//将s1中的空格替换为&
	
	}
}
