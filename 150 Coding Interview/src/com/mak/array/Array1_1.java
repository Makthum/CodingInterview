package com.mak.array;

public class Array1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Unique("xeropho"));
	}

	public static boolean Unique(String tmp)
	{
		boolean[] char_set= new boolean[260];
		for(int i=0;i<tmp.length();i++)
		{
			int val=tmp.charAt(i);
			if(!char_set[val])
				char_set[val]=true;
			else
				return false;
			
		}
		return true;
	}
	
	
}
