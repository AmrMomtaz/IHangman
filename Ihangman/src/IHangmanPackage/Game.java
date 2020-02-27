package IHangmanPackage;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.*; 


public class Game implements IHangman
{
	String Secret_Word = selectRandomSecretWord();
	char Apparent_Word []= new char [Secret_Word.length()];
    List<Character> Taken_Characters = new ArrayList<Character>();
	int count = 0,maximum=1;
	boolean win=false;
	Game()
	{
		Arrays.fill(Apparent_Word, '-');
		for(int i = 0;i<Secret_Word.length();i++)
		{
			if(Secret_Word.charAt(i)==' ')Apparent_Word[i]=' ';
		}
	}
	public void setDictionary(String[] words)
	{
		try
		{
			FileReader fr = new FileReader("countries.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			int i = 0;
			do 
			{
				words[i]=str;
				i++;
				str = br.readLine();
			}while (str != null);
			fr.close();
			br.close();
		}catch (IOException e)
		{
			System.out.println(e);
		}
	}
	public String selectRandomSecretWord()
	{
		String words [] = new String [187];
		setDictionary(words);
		Random rand = new Random();
		int random_number = rand.nextInt(187);
		return words[random_number];
	}
	public String guess(Character c)
	{
		boolean check = false;
		for (int i = 0 ; i < Secret_Word.length();i++)
		{
			if (c == Secret_Word.charAt(i)||Character.toUpperCase(c)==Secret_Word.charAt(i))
			{
				Apparent_Word[i]=Secret_Word.charAt(i);
				check = true;
			}
		}
		if(check)count--;
		return new String(Apparent_Word);
	}
	public void setMaxWrongGuesses(Integer max)
	{
		maximum = max;
	}
	public void play(char in)
	{
		if ((in>='a'&&in<='z')||(in>='A'&&in<='Z'))
		{
			in =Character.toLowerCase(in);
			if (Taken_Characters.contains(in))return;
			guess(in);
			Taken_Characters.add(in);
			count++;
		}else return;
		if (count>=maximum)throw new RuntimeException ("Maximum of trials is reached");
		for (int i = 0 ; i <Secret_Word.length();i++)
		{
			if (Apparent_Word[i]=='-')break;
			if ( i ==Secret_Word.length()-1)
			{
				win = true;
				return;
			}
		}
	}
	public void Re_Initialize()
	{
		Apparent_Word = new char[Secret_Word.length()];
		Arrays.fill(Apparent_Word, '-');
		for(int i = 0;i<Secret_Word.length();i++)
		{
			if(Secret_Word.charAt(i)==' ')Apparent_Word[i]=' ';
		}
	}
}
