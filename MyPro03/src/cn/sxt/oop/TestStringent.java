package cn.sxt.oop;

public class TestStringent {

	public static void main(String[] args){
		StringBuilder s=new StringBuilder();
		long num1=Runtime.getRuntime().freeMemory();
		long time1=System.currentTimeMillis();
		
		//注意  遇到循环累加字符串  使用StringBuilder
		//节省内存和时间
		for(int i=0;i<26;i++){
			char temp=(char) ('a'+i);
			s.append(temp);
		}
		long num2=Runtime.getRuntime().freeMemory();
		long time2=System.currentTimeMillis();
		System.out.println(s);
		System.out.println("占用内存"+(num1-num2));
		System.out.println("占用时间"+(time2-time1));
		/*System.out.println(Integer.toHexString(s.hashCode()));
		s.reverse();    //倒序
		System.out.println(s);
		System.out.println(Integer.toHexString(s.hashCode()));
		s.setCharAt(3,'张');//修改   序号为3处的     字符为  张
		System.out.println(s);
		System.out.println(Integer.toHexString(s.hashCode()));
		s.insert(1, '我').insert(2, '爱').insert(3, '你');//链式调用
		System.out.println(s);
	*/
	}
}
