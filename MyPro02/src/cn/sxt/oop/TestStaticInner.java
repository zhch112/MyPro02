package cn.sxt.oop;

public class TestStaticInner {

	public static void main(String[] args){
		Outer2.Inner inner=new Outer2.Inner();
		inner.fly();
	}
}
//��ͬһ�����У�Ҫע��������ͬ
class Outer2{
	
	static class Inner{
		void fly(){
			System.out.println("��̬�ڲ���");
		}
	}
}