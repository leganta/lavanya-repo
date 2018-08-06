package org.cap;

public class SalesClass {
int[] arr= {1,2,3,4,5};
	public void show() {
		int s=0;
		for(int num:arr) {
			System.out.println(num);
			s+=num;
		}
		System.out.println(s);
	}
}
