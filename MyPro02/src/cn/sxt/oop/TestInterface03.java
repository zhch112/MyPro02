package cn.sxt.oop;

public class TestInterface03 {

}
interface A{
	void testa();
}

interface B{
	void testb();
}
/*�ӿڿ��Զ�̳У��ӿ�C�̳нӿ�A��B
 * 
 * java����ֻ�е��̳У�û�ж�̳�
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