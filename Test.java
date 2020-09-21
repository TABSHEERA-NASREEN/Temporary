
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	String ar[]=input.split(" ");
	int len=ar.length;
	String ans="";
	int f=0;
	for(int i=0;i<len-1;i++)
	{
		String s=ar[i];
		if(s.equalsIgnoreCase("OTP"))
		{
			if(ar[i+1].length()==6)
			{
				for(int j=0;j<ar[i+1].length();i++)
				{
					if(Character.isDigit(ar[i+1].charAt(j)))
					{
						
					}
					else 
					{
						break;
					}
				}
				ans=ar[i+1];
				f=1;
			}
		}
	}
	if(f==1)
	{
		System.out.println(ans);
	}
	else 
	{
		System.out.println("OTP not available");
	}
	sc.close();
	}
}
