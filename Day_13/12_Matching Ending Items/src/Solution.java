/*
Task

Write a RegEx to match a test string,S, under the following conditions:

S should consist of only lowercase and uppercase letters (no numbers or symbols).
S should end in s.
This is a RegEx-only challenge, so you are not required to write any code.
Simply replace the blank (_________) with your RegEx pattern.
 */

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[A-Za-z]*s$"); // Use \\ instead of using \

    }
}

