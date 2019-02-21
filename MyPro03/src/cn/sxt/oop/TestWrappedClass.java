package cn.sxt.oop;
/**
 * 包装类对象  提供基本数据类型，包装类，字符串    之间的相互转换
 * @author 喵喵了个眯
 *
 */
public class TestWrappedClass {

	public static void main(String[] args){
		
		//基本数据类型转换为包装类对象
		Integer a=new Integer(3);
		Integer b=Integer.valueOf(10);
		
		//包装类对象转换为基本数据类型
		int c=b.intValue();
		double d=b.doubleValue();
		
		//把字符串转换成包装类对象
		Integer e=new Integer("3333");
		Integer f=Integer.parseInt("44444");
		
		//把包装类对象转换为字符串
		String str=f.toString();
		String str1=""+f;
		
	}
}
