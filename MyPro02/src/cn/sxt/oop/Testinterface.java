package cn.sxt.oop;

public interface Testinterface {
	
	/*public static final*/int MAX_AGE=100;
	
	/*public abstract*/void test01();
	 	
}

class MyClass implements Testinterface {

	@Override
	public void test01() {
		System.out.println("½Ó¿Ú");
		
	}
	
}
