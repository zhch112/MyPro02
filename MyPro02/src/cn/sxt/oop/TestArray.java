package cn.sxt.oop;

public class TestArray {
	public static void main(String[] args){
	String[] s={"aa","aaa","aaaa","aaaaa"};
	//Elementsdelet(s,2);
	Elementsadd(s);
	}
	
	
	
	public static String[] Elementsdelet(String[] s,int index){
		System.arraycopy(s,index,s,index-1,s.length-index);
		s[s.length-1]=null;
		for(int i=0;i<s.length;i++){
			System.out.println(i+" "+s[i]);
		}
		return s;
	}
	
	public static String[] Elementsadd(String[] s){
		String[] s0=new String[s.length+10];
		System.arraycopy(s, 0, s0, 4, s.length);
		s0[3]="a";
		for(int i=0;i<(s.length+10);i++){
			System.out.println(i+" "+ s0[i]);
		}
		return s0;
	}
}

	
