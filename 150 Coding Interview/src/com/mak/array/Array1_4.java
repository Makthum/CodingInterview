package com.mak.array;

public class Array1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("aabbccd", "dbbaacd"));
	}
	
	
	public static boolean isAnagram(String s1, String s2)
	{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
	    boolean[] temp=new boolean[256];
	    for(int i=0;i<s1.length();i++)
	    {
	    	temp[c1[i]]=true;
	    }
	    for(int i=0;i<s2.length();i++)
	    {
	    	if(!temp[c2[i]])
	    		return false;
	    }
	    return true;
	}

}
