package cn.sxt.oop;

import java.util.Arrays;

public class TestArraySort {

	public static void main(String[] args){
	//	int[] s=new int[10];
	//	s[1]=3;
		int[] a={3,0,1,6,8,2,4,9,5,7};
		//冒泡排序
		for(int j=0;j<a.length-1;j++){//    j每执行完一次循环，找出一个最大数
			boolean flag=true;
			for(int i=0;i<a.length-1-j;i++){//   -j：  j每执行完一次循环，找出一个最大数,少比较一组
				if(a[i]>a[i+1]){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					flag=false;
				}
			
				System.out.println(Arrays.toString(a));
			}
			if(flag){///优化 作用
				System.out.println("结束！！！");
				break;
			}
			System.out.println("################");
		}
	}
}
