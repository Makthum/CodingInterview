package com.mak.array;

public class Array1_6{
	public static void main(String args[]){
		int test[][]={{0,0,1},{0,1,0},{1,0,0}};
		rotate90(test);
		System.out.println(test[0][0]);
	}

	public static void rotate90(int[][] inp){
		int size=inp[0].length;
		for(int layer=0;layer<size/2;layer++){
			int first=layer;
			int last=size-1-layer;
			for(int i=first;i<last;i++){
				int offset=i-first;
				//perform cyclic swap. Hence store the first element in temp and swap 
				int temp=inp[first][i];

				inp[first][i]=inp[last-offset][first];
				inp[last-offset][first]=inp[last][last-offset];
				inp[last][last-offset]=inp[i][last];
				inp[i][last]=temp;
			}
		}
	}
}