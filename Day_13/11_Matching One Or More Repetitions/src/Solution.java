/*
Task

You have a test string S.
Your task is to write a regex that will match S using the following conditions:

S should begin with 1 or more digits.
After that, S should have 1 or more uppercase letters.
S should end with 1 or more lowercase letters.
Note

This is a regex only challenge. You are not required to write any code.
You have to fill the regex pattern in the blank (_________).
 */

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d+[A-Z]+[a-z]+$"); // Use \\ instead of using \

    }
}

