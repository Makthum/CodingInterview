package com.mak.array;

public class Array1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(reverse("woh"));
      System.out.println(reverse_SingleArray("malayalams"));
      
	}

	public static String reverse(String tmp)
	{
		char[] result= new char[tmp.length()];
		for(int i=tmp.length()-1;i>=0;i--)
		{
			result[tmp.length()-(i+1)]=tmp.charAt(i);
		}
		return new String(result);
		
	}
	
	public static String reverse_SingleArray(String tmp)
	{
		char[] tmp1=tmp.toCharArray();
		char temp;
		
			for(int i=0;i<tmp1.length/2;i++)
			{
				temp=tmp1[i];
				tmp1[i]=tmp1[tmp1.length-i-1];
				tmp1[tmp1.length-i-1]=temp;
			}
		
		return new String(tmp1);
	}
}
