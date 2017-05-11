package HakerRank_Java.BigNumber;

/*
Java BigDecimal class can handle arbitrary-precision signed decimal numbers. Lets test your knowledge on them!

You are given nn real numbers, sort them in descending order! Read data from System.in.

Note: To make the problem easier, we provided you the input/output part in the editor. Print the numbers as they appeared in the input, don't change anything. If two numbers represent numerically equivalent values, the output must list them in original order of the input

Input Format
The first line will consist an integer nn, each of the next n lines will contain a real number. nn will be at most 200. The numbers can have at most 300 digits!

Output Format
Print the numbers in descending orders, one number in each line.
*/

import java.math.BigDecimal;
import java.util.*;

class BigDecimalC{

    public static void main(String []argh)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }
       sc.close();
       
       Arrays.sort(s, new Comparator<Object>(){
           
           public int compare(Object a1, Object a2){
               BigDecimal a = new BigDecimal((String)a1);
               BigDecimal b = new BigDecimal((String)a2);
               return a.compareTo(b);
           }
           
       });
        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}
