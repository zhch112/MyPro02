package cn.sxt.oop;

import java.util.Arrays;

public class TestArraySort {

	public static void main(String[] args){
	//	int[] s=new int[10];
	//	s[1]=3;
		int[] a={3,0,1,6,8,2,4,9,5,7};
		//ð������
		for(int j=0;j<a.length-1;j++){//    jÿִ����һ��ѭ�����ҳ�һ�������
			boolean flag=true;
			for(int i=0;i<a.length-1-j;i++){//   -j��  jÿִ����һ��ѭ�����ҳ�һ�������,�ٱȽ�һ��
				if(a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					flag=false;
				}
			
				System.out.println(Arrays.toString(a));
			}
			if(flag){///�Ż� ����
				System.out.println("����������");
				break;
			}
			System.out.println("################");
		}
	}
}