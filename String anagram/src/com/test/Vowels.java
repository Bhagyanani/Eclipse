package com.test;

public class Vowels {

	public static void main(String[] args) {
		String line ="hai.";
		int vowels=0,consonants=0,digits=0,spaces=0;
		line =line.toLowerCase();
		for(int i=0;i<line.length();++i)
		{
			char c=line.charAt(i);
			if(c=='a'||c=='e'|| c=='i')
			{
				++vowels;
			}
			else if((c>='b'&& c<='c'))
			{
				++consonants;
			}
			else if((c>='0'&& c<='8'))
			{
				++digits;
			}
			else if((c== ' '))
			{
				++spaces;
			}
		}
		System.out.println("Vowels : +vowels");
		System.out.println("Vowels : +cosonants");
		System.out.println("Vowels : +digits");
		System.out.println("Vowels : +spaces");

	}

}
