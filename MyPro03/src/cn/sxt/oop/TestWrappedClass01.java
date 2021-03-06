package cn.sxt.oop;
/**
 * 
 * 
 * 缓存[-128,127]之间的数字。
 * 实际就是系统初始的时候，创建[-128,127]之间的一个缓存数组
 * 当我们再调用ValueOf()的时候，首先检查是否在楼上范围，在则从缓存数组中拿出已经建好的对象
 * 如果不在这个范围，则创建新的Integer对象
 * 
 * 
 * @author 喵喵了个眯
 *
 */
public class TestWrappedClass01 {

	public static void main(String[] args){
		Integer a=3;//自动装箱 编译器自动调用            Integer a=a.valueOf(3)
		int b=a;    //自动拆箱      编译器自动调用       int b=a.intValue();
		System.out.println(a);
		
		//包装类空指针异常问题
		Integer c=null;
		if(c!=null){
		int f=c;
		}
		Integer in1=Integer.valueOf(123);
		Integer in2=123;
		System.out.println(in1==in2);//123在缓存对象里面 ，直接返回该值缓存对象， 结果为true
		System.out.println(in1.equals(in2));//比较字符串是否相等    而==是判断是否为同一个对象
		System.out.println("####################");
		Integer in3=Integer.valueOf(1234);
		Integer in4=1234;
		System.out.println(in3==in4);//1234不在缓存对象中，会new一个新对象
		System.out.println(in3.equals(in4));
	}
}
