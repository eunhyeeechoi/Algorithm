package com.test01;
// 엉엉 처음으로 백점맞은 문제
public class t8 {
	public long[] solution(int x, int n) {
		long[] answer = {};
		long data = 0;
		for (int i = 0; i < n; i++) {
			answer = new long[n];
			data += x;
			System.out.print(data);
			answer[i]=(long)data; 
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		t8 hey = new t8();
		long[] bb = hey.solution(-4, 4);
		System.out.println();
		for(int i =0; i<bb.length; i++) {
			System.out.print(bb[i]);
		}
		System.out.println(bb);
	}
}
