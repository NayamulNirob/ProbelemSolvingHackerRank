/*
Task

You have a test String S.
Write a regex which can match all the occurences of characters which are not immediately preceded by vowels (a, e, i, u, o, A, E, I, O, U).

Note

This is a regex only challenge. You are not required to write a code.
You have to fill the regex pattern in the blank (_________).

JavaScript do not support lookbehind.
 */
public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(?<![aeiouAEIOU])(.)"); //Use '\\' instead of '\'.
    
    }
}

