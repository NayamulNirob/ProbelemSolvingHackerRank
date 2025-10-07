/*
Task

You have a test String S.
Write a regex which can match all the occurences of digit which are immediately preceded by odd digit.

Note

This is a regex only challenge. You are not required to write a code.
You have to fill the regex pattern in the blank (_________).
 */
public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(?<=[13579])[0-9]"); //Use '\\' instead of '\'.
    
    }
}

