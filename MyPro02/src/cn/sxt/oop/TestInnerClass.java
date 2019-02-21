package cn.sxt.oop;

public class TestInnerClass {

	public static void main(String[] args){
		
		//创建内部类对象
		Outer.Inner inner=new Outer().new Inner();
		inner.show();
	}
}
class Outer{
	private int age=10;
	public void testOuter() {
		System.out.println("普通方法");
	}
	
	//非静态内部类，形成良好的封装环境
	//普通内部类，不能使用静态成员变量和方法
	class Inner{
		int age=20;
		public void show(){
			int age=30;
			System.out.println("外部类的成员变量age:"+Outer.this.age);
			System.out.println("内部类的成员变量age:"+this.age);
			System.out.println("局部变量age:"+age);
		}
		
	}
}