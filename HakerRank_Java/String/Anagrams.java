package HakerRank_Java.String;


/*
Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.

This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

Sample Input 1
anagram
margana

Sample Output 1:
Anagrams
*/

import java.util.*;

public class Anagrams {

	 static boolean isAnagram(String a, String b) {
	        // Complete the function
	        
	        char A[] = (a.toLowerCase()).toCharArray();
	        char B[] = (b.toLowerCase()).toCharArray();
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	       return Arrays.equals(A, B);
	    }
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}