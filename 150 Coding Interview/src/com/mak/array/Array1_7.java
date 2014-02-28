package com.mak.array;

public class Array1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int a[][]={{1,2,3},{0,2,1},{2,3,0}};
	  insertZero(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("");
			for(int j=0;j<a[0].length;j++)
			{
			 System.out.print(a[i][j] +"\t");
			}
			
			}
	}
	
	public static int[][] insertZero(int a[][])
	{
	  int[] row= new int[a.length];
	  int[] col= new int[a[0].length];

	  
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0)
				{
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(row[i]==1|col[j]==1)
				{
					a[i][j]=0;
				}
			}
			
			}
		
		return a;
	}

}
