package cn.sxt.oop;

public class TestStaticInner {

	public static void main(String[] args){
		Outer2.Inner inner=new Outer2.Inner();
		inner.fly();
	}
}
//在同一个包中，要注意类名不同
class Outer2{
	
	static class Inner{
		void fly(){
			System.out.println("静态内部类");
		}
	}
}