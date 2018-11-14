/*************************************************************************************************
** Problem
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
It's time to test your knowledge of Static initialization blocks. 

You are given a class Solution with a main method. 
Complete the given code so that it outputs the area of a parallelogram with breadth \B\ and height \H\. 

If  \B <= 0\ or  \H <= 0\, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

** Input Format
There are two lines of input. 
The first line contains \B\: the breadth of the parallelogram. 
The next line contains \H\: the height of the parallelogram.

** Constraints
    -100 <= B <= 100
    -100 <= H <= 100
    
** Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

** Sample input 1 **                       ** Sample output 1 **
-------------------------                  -------------------------
1                                          3
3                                          -------------------------
-------------------------

** Sample input 2 **                       ** Sample output 2 **
-------------------------                  ---------------------------
-1                                         java.lang.Exception: Breadth and height must be positive
2                                          ----------------------------
--------------------------

****************************************************************************************************************/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    static int B = sc.nextInt();
    static int H = sc.nextInt();

    static boolean flag = true;

    static {
        try {
            if(B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
