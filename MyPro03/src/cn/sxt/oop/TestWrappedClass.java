package cn.sxt.oop;
/**
 * ��װ�����  �ṩ�����������ͣ���װ�࣬�ַ���    ֮����໥ת��
 * @author �����˸���
 *
 */
public class TestWrappedClass {

	public static void main(String[] args){
		
		//������������ת��Ϊ��װ�����
		Integer a=new Integer(3);
		Integer b=Integer.valueOf(10);
		
		//��װ�����ת��Ϊ������������
		int c=b.intValue();
		double d=b.doubleValue();
		
		//���ַ���ת���ɰ�װ�����
		Integer e=new Integer("3333");
		Integer f=Integer.parseInt("44444");
		
		//�Ѱ�װ�����ת��Ϊ�ַ���
		String str=f.toString();
		String str1=""+f;
		
	}
}
