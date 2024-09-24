package July_25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class strDiff
{
	public static void main(String[] args)
	{
		String a="abcd",b;
		List<Character> characters = new ArrayList<>(); 
        for (char c : a.toCharArray()) { 
            characters.add(c); 
        } 
        characters.add('e');
        System.out.println(characters);
        // Shuffle the list 
        Collections.shuffle(characters); 
  
        // Convert the list back to String 
        StringBuilder shuffledString = new StringBuilder(); 
        for (char c : characters) { 
            shuffledString.append(c); 
        } 
        b = shuffledString.toString(); 
        System.out.println(b);
        
        for(int i=0;i<b.length();i++)
        {
        	int flag = 0;
        	for(int j=0;j<a.length();j++)
        	{
//        		System.out.println(i+","+j);
        		if(a.charAt(j)==b.charAt(i))
        			flag = 1;
        	}
        	if(flag==0)
        	{
        		System.out.println(b.charAt(i)+" is extra");
        	}
        }
	}
	
}
