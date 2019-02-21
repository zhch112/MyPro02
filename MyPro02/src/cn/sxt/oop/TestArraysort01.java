package cn.sxt.oop;

import java.util.Arrays;

public class TestArraysort01 {

	public static void main(String[] args){
		int[] s={12,2,36,24,54,16,78,28,9,100};
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		System.out.println(mySort(s,14));
		
	}
	//二分法查找
	public static int mySort(int[] s,int value){
		int low=0;
		int high=s.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(value==s[mid]){
				return mid;
			}
			if(value<s[mid]){
				high=mid-1;
			}
			if(value>s[mid]){
				low=mid+1;
			}
		}
		return -1;
	}
}
