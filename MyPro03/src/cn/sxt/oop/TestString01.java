package cn.sxt.oop;

public class TestString01 {

	public static void main(String[] args){
		String str="abcdef";
		String str1=str.substring(2,4);
		System.out.println(Integer.toHexString(str.hashCode()));
		//hashCode();������õ���object��hashCode()����,���Ƿ����øö�����ڲ���ַת���ɵ�һ������.
		//toHexString();���ǰ��������ת����16����!
		System.out.println(Integer.toHexString(str1.hashCode()));
		System.out.println("####################");
		
		//˵��str��str1��������ͬ�Ķ���
		
		
		///StringBuilder  StringBudder  �ɱ��ַ�����
		StringBuilder s=new StringBuilder("abcdef");
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(s);
		s.setCharAt(2, 'M');
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.print(s);
		
		///ͬһ����ַ
	}
}