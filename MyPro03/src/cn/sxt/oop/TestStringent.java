package cn.sxt.oop;

public class TestStringent {

	public static void main(String[] args){
		StringBuilder s=new StringBuilder();
		long num1=Runtime.getRuntime().freeMemory();
		long time1=System.currentTimeMillis();
		
		//ע��  ����ѭ���ۼ��ַ���  ʹ��StringBuilder
		//��ʡ�ڴ��ʱ��
		for(int i=0;i<26;i++){
			char temp=(char) ('a'+i);
			s.append(temp);
		}
		long num2=Runtime.getRuntime().freeMemory();
		long time2=System.currentTimeMillis();
		System.out.println(s);
		System.out.println("ռ���ڴ�"+(num1-num2));
		System.out.println("ռ��ʱ��"+(time2-time1));
		/*System.out.println(Integer.toHexString(s.hashCode()));
		s.reverse();    //����
		System.out.println(s);
		System.out.println(Integer.toHexString(s.hashCode()));
		s.setCharAt(3,'��');//�޸�   ���Ϊ3����     �ַ�Ϊ  ��
		System.out.println(s);
		System.out.println(Integer.toHexString(s.hashCode()));
		s.insert(1, '��').insert(2, '��').insert(3, '��');//��ʽ����
		System.out.println(s);
	*/
	}
}