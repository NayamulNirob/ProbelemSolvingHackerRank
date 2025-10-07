/*
Task

You have a test string S.
Write a regex that can match all occurrences of o followed immediately by oo in S.

Note

This is a regex only challenge. You are not required to write code.
You have to fill the regex pattern in the blank (_________).
 */

public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("o(?=oo)"); //Use '\\' instead of '\'
    
    }
}

