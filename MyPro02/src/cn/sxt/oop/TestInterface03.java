package cn.sxt.oop;

public class TestInterface03 {

}
interface A{
	void testa();
}

interface B{
	void testb();
}
/*接口可以多继承，接口C继承接口A和B
 * 
 * java的类只有单继承，没有多继承
 * 
 */
interface C extends A,B{
	void testc();
}

class Mysubclass implements C{

	@Override
	public void testa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testc() {
		// TODO Auto-generated method stub
		
	}
	
}