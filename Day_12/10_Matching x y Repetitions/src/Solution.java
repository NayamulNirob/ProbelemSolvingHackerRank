/*
Task

You have a test string S.
Your task is to write a regex that will match  using the following conditions:

S should begin with  1 or 2  digits.
After that,S  should have  3 or more letters (both lowercase and uppercase).
Then S should end with up to  3. symbol(s). You can end with 0 to  3. symbol(s), inclusively.
Note

This is a regex only challenge. You are not required to write any code.
You have to fill the regex pattern in the blank (_________).
 */

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{1,2}[a-zA-Z]{3,}\\.{0,3}$"); // Use \\ instead of using \

    }
}

