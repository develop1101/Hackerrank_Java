/********************************************************************************************
** Problem
Given an input integer, you must determin which primitive data types are capable of properly storing that input.

** Input Format
Th first line contains an integer, T, denoting the number of test casses.
Each test case, T, is comprised of a single line with an integer, \n\, which can be arbitarily large or small.

** Output Format
For each input variable \n\ and appropriate primitive \dataType\, 
you must determine if the given primitives are capable of storing it.

If yes, then print:
---------------------------------
  n can be fitted in:
  * dataType
---------------------------------

If there is more than one appropriate data type, 
print each one on its own line and order them by size (i.e.: byte < short < int < long).

If the number cannot be stored in one of the four aforementioned primitives, print the line:
------------------------------------
  n can't be fitted anywhere.
------------------------------------

** Sample Input **
------------------------------------
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
-------------------------------------

** Sample Output **
-------------------------------------
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
-----------------------------------------

** Explanation
-150 can be stored in a short an int, or a long.
2133333333333333333333333333333333333 is very large and outside of the allowable range of values
for the primitive data types discussed in this problem.

** Explain the Algorithm
----------------------------------------------
  TYPE     SIZE IN BYTES       RANGE
  byte      1 byte             -128 to 127
  short     2 byte             -32,768 to 32,767
  int       4 byte             -2,147,483,648 to 2,147,483, 647
  long      8 byte             -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
-----------------------------------------------
if you recognize the positive number of the primitive variable is alway less with 1, 
check the Byte the minimum  is -128 and the positive is not 128, its 128 -1 = 127, 
so we add -1 so we can have the right positive range and have the right value.

In this way, you can use Math.Pow(2, n) to solve this problem.
For example, the minimum of short is -2^15, which is -32,768, and the maximum of short is 2^15 - 1, which is 32,767.
So, inside the if statement for type short,
-------------------------------------------
if ( x >= -(Math.pow(2,15)) && x <= (Math.pow(2,15)-1))
    System.out.println("* short");
-------------------------------------------

However, I am going to use MIN_VALUE and MAX_VALUE functions here.

*****************************************************************************************/

import java.util.*;
import java.io.*;



public class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                  System.out.println("* Short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                  System.out.println("* Integer");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                  System.out.println("* Long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
