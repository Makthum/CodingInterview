package com.mak.array;

public class Array1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(replaceSpaces(" ".toCharArray()));
	}

	public static String replaceSpaces(char[] str)
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==' ')
			count++;
		}
		char[] news=new char[str.length+count*2];
		int j=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i]==' ')
			{
				news[j++]='%';
				news[j++]='2';
				news[j++]='0';
			}
			else
			{
				news[j++]=str[i];
			}
		}
		return new String(news);
	}
}
