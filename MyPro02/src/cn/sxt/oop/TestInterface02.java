package cn.sxt.oop;

public class TestInterface02 {
	public static void main(String[] args){
		Volant v=new Angel();
		v.fly();
	}
}

interface Volant{
	int fly_hight=1000;
	void fly();
}

interface Honest{
	void helpOther();
}
class Angel implements Volant,Honest{

	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther()");
		
	}

	@Override
	public void fly() {
		System.out.println("Angel.fly()");
		
	}
	
}///实现多个父接口