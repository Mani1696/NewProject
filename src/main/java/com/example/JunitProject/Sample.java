package com.example.JunitProject;

public class Sample {
	public int findMin(int[] a) {
		int num=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<num) {
				num=a[i];
			}
		}
		return num;
	}
	public String findMaxLength(String[] a) {
		String max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max=a[i];
			}
		}
		return max;
		
	}

}
