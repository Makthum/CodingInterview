package com.mak.array;

import java.util.HashMap;

public class Array_pair 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
     int[] s = new int[]{2,4,6,8,10,12};
     findPair(s, 12);
	}
	
	public static void findPair(int[] lt,int sum)
	{
		int i,j=0;
		j=lt.length-1;
		
		System.out.println("Naveen Edit " + lt.length + " Naveen edit ended");
		HashMap<Integer, Integer> lo= new HashMap<>();
		for(i=0;i<lt.length;i++)
		{
			lo.put(new Integer(lt[i]),lt[i]);
		}
		
		for(i=0;i<lt.length;i++)
		{
			if(lo.containsKey(new Integer(sum-lt[i])))
				System.out.println(lt[i] +"  \t" +(sum-lt[i]));
		}
	}

}
