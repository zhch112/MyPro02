package cn.sxt.oop;
/**
 * 
 * 
 * ����[-128,127]֮������֡�
 * ʵ�ʾ���ϵͳ��ʼ��ʱ�򣬴���[-128,127]֮���һ����������
 * �������ٵ���ValueOf()��ʱ�����ȼ���Ƿ���¥�Ϸ�Χ������ӻ����������ó��Ѿ����õĶ���
 * ������������Χ���򴴽��µ�Integer����
 * 
 * 
 * @author �����˸���
 *
 */
public class TestWrappedClass01 {

	public static void main(String[] args){
		Integer a=3;//�Զ�װ�� �������Զ�����            Integer a=a.valueOf(3)
		int b=a;    //�Զ�����      �������Զ�����       int b=a.intValue();
		System.out.println(a);
		
		//��װ���ָ���쳣����
		Integer c=null;
		if(c!=null){
		int f=c;
		}
		Integer in1=Integer.valueOf(123);
		Integer in2=123;
		System.out.println(in1==in2);//123�ڻ���������� ��ֱ�ӷ��ظ�ֵ������� ���Ϊtrue
		System.out.println(in1.equals(in2));//�Ƚ��ַ����Ƿ����    ��==���ж��Ƿ�Ϊͬһ������
		System.out.println("####################");
		Integer in3=Integer.valueOf(1234);
		Integer in4=1234;
		System.out.println(in3==in4);//1234���ڻ�������У���newһ���¶���
		System.out.println(in3.equals(in4));
	}
}