/*
Task

You have a test String S.
Your task is to write a regex which will match S with the following condition:

S should have 3 or more consecutive repetitions of ok.
Note

This is a regex only challenge. You are not required to write a code.
You have to fill the regex pattern in the blank (_________).
 */
public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(?:ok){3}"); // Use \\ instead of using \;  
    
    }
}

