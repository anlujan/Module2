package Module2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
 

public class Counter {  
	
	static void wordCount(String fileName, Map<String, Integer> words)throws FileNotFoundException {
		Scanner file = new Scanner(new File(fileName));	
		
		while (file.hasNext()) {
			String word = file.next().toLowerCase().replaceAll("\"[<](/)?div[^>]*[>]", "");
		//split here? DIV TAG
			Integer count = words.get(word);
			
			if(count != null)
				++count; 
			else
				count = 1;
			words.put(word, count);
		}
		file.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> words = new HashMap<String, Integer>();
		wordCount("C:\\Users\\allis\\Documents\\School\\SD1\\TheRavenPoemWithHTMLTags.txt", words);
				//Comparator here?
	System.out.println(words);
	}
}

