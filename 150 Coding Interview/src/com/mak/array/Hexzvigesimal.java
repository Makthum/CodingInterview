package com.mak.array;

public class Hexzvigesimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num2alpha(25));
		System.out.println(alpha2num("MAKTHUM"));
	}

	public static String num2alpha(int val)
	{
		String output="";
		while(val!=0)
		{
			int i=val%26;
			if(i==0)
			{
				output= "Z" + output;
			}
			else
			{
				output=(char)(i+64)+output;
			}
			val=val/26;
		}
		return output;
	}
	
	public static double alpha2num(String val)
	{
		double num=0;
		if(val!=null)
		{
			for(int i=0;i<val.length();i++)
			{
				int j=val.charAt(val.length()-1-i);
				num=num+(Math.pow(26, i)*((j-64)%26));
			}
		}
		return num;
	}
	
}
