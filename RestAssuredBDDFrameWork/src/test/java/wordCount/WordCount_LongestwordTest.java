package wordCount;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class WordCount_LongestwordTest {

	
	

		@Test
		public void positiveTestcase1() {
					
			assertEquals(6, WordCount_Longestword.Wordcount("The cow jumped over the moon"));
			assertEquals("jumped", WordCount_Longestword.Longestword("The cow jumped over the moon"));
			assertEquals(6, WordCount_Longestword.LongestWordLength("The cow jumped over the moon"));
		}

		@Test
		public void positiveTestcase2() {
			
			assertEquals(10, WordCount_Longestword.Wordcount("These are the unit test cases for the written code"));
			assertEquals("written", WordCount_Longestword.Longestword("These are the unit test cases for the written code"));
			assertEquals(7, WordCount_Longestword.LongestWordLength("These are the unit test cases for the written code"));
		}

		@Test
		public void positiveTestcase3() {
			
			assertEquals(7, WordCount_Longestword.Wordcount("Comments are given in the main code"));
			assertEquals("Comments", WordCount_Longestword.Longestword("Comments are given in the main code"));
			assertEquals(8, WordCount_Longestword.LongestWordLength("Comments are given in the main code"));
		}

		@Test
		public void positiveTestcase4() {
			
			assertEquals(4, WordCount_Longestword.Wordcount("This task is completed"));
			assertEquals("completed", WordCount_Longestword.Longestword("This task is completed"));
			assertEquals(9, WordCount_Longestword.LongestWordLength("This task is completed"));
		}

		@Test
		public void NegativeTestcase() {
				
			assertEquals(1, WordCount_Longestword.Wordcount(""));
			assertEquals("", WordCount_Longestword.Longestword(""));
			assertEquals(0, WordCount_Longestword.LongestWordLength(""));
		}

	}


