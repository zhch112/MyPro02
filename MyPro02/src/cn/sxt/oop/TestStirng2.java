package cn.sxt.oop;

public class TestStirng2 {
	public static void main(String[] args){
		String s1="core java";
		String s2="Core java";
		System.out.println(s1.charAt(3));//��ȡ�±�Ϊ3���ַ�
		System.out.println(s1.equalsIgnoreCase(s2));//�Ƚ������ַ��������Դ�Сд��
		System.out.println(s1.indexOf("java"));//�ַ���s1���Ƿ����java
		String s=s1.replace(' ', '&');//��s1�еĿո��滻Ϊ&
	
	}
}
