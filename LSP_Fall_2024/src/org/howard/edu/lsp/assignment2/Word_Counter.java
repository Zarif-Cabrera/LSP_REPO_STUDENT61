package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Word_Counter {

	public static void main(String[] args)
			
		throws FileNotFoundException
	{
		File file = new File("sample.txt");
		
		Scanner sc = new Scanner(file);
		
        sc.useDelimiter("\\Z");
		
        String[] arrOfStr = sc.next().toString().split("[\\s,. '\"()\\p{Punct}]+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String element:arrOfStr) {

        	if (element.trim().length() > 3 && !element.matches(".‘’*\\d.*")) {
        		wordCountMap.put(element.trim().toLowerCase(), wordCountMap.getOrDefault(element.trim().toLowerCase(), 0) + 1);	
        	}
        }
        
        sc.close();
      
        
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	
}
}


