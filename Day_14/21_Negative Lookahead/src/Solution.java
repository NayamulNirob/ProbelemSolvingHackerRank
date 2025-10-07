/*
Task

You have a test String S.
Write a regex which can match all characters which are not immediately followed by that same character.

Example

If S = goooo, then regex should match goooo. Because the first g is not follwed by g and the last o is not followed by o.

Note

This is a regex only challenge. You are not required to write a code.
You have to fill the regex pattern in the blank (_________).
 */

public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("(.)(?!\\1)"); //Use '\\' instead of '\'.
    
    }
}

