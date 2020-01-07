package task;

public class MyArray {

	private char[] s= new char[26];
	private String str;
	int count;
	private char[] tempArray;
	public char[]  createArray()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char)('A'+i);
		}
		str ="HELLO WORLD";
		return s;
	}
	public void displayArray() {
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+",");
			
		}
	}
	public void stringConvertedArray()
	{
		this.str=str;
		 tempArray=str.toCharArray();
	}
	public void displayConvertedArray()
	{
		for(char  ch:tempArray)
		{
			System.out.println(ch);
		}
	}
public void vowels()
	{
		if(ch)
}
	public void noChars()
	{ 
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)!=' ')
		{
			count++;
		}
		//System.out.println(count);
	}
		System.out.println(count);
}
	
}
