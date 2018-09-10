package wordCount;
import java.util.Scanner;

public class WordCount_Longestword {
	
	
	public static int Emptystring(String str){
		if (str==null ||str.isEmpty()){
			
			return 0;
		}
		return 0;
	}
	
	/* ========== Find the number of words in the given input sentence ========== */
	 
	public static int Wordcount(String str){
		
		Emptystring(str);  //check if the input is empty
		
		String [] s= str.split(" "); //split the string using space and store the words in a string array s	
		
		int word_count = s.length;  //stroing number of words in a variable
		
		return word_count;  //return to main function to print the result
	}	
	
	/* ========== Find the longest word in the given input sentence =========== */
	
	public static String Longestword(String str){
		
		Emptystring(str); //check if the input is empty
		
		String [] s= str.split(" ");
		
		String longest =""; //declare a variable to store the longest word in the input sentence
		
		for (String s1:s)  //iterate through the all elements of array s using for each loop
			 {
				if (s1.length()>longest.length()) //compare the length
				{
					longest = s1;
				}
			}
		
		return longest;  //return to main function to print the result
		
	}

	
	/* ========== Find the longest word count =========== */
	
	public static int LongestWordLength(String str)
    {
		Emptystring(str); //check if the input is empty
		
		int n = str.length();
		int res = 0, curr_len = 0;
		
		for (int i = 0; i < n; i++)
		{
			// If current character is not
			// end of current word.
			if (str.charAt(i) != ' ')
				curr_len++;
 
			// If end of word is found
			else
			{
				res = Math.max(res, curr_len);
				curr_len = 0;
			}
		}
     // We do max one more time to consider
    // last word as there won't be any space
    // after last word.
    return Math.max(res, curr_len);   //return to main function to print the result
    
   }

	public static void main(String args[])
	{ 
		
		Scanner scan = new Scanner(System.in);  //to read input sentence from user
		System.out.println("Enter any sentence:"); 
		String str = scan.nextLine();
		  
		int word_count = Wordcount(str);
		/*  Print the number of words in the given input sentence */
		System.out.println("Number of words in given string  is: " + word_count); 
 	
		String longest_word = Longestword(str);
		/*  Print the longest word in the given input sentence */
		System.out.println("The longest word in given string  is: " + longest_word);
		
		int Longestword_length = LongestWordLength(str);
		/*  Print the length of longest word in the given input sentence */
		System.out.println("Longest word "+"\""+longest_word+"\""+" length is: " +Longestword_length);

	}

}
