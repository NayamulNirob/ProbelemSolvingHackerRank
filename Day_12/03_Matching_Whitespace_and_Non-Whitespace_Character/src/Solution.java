/*
Task

You have a test string S. Your task is to match the pattern XXxXXxXX
Here, x denotes whitespace characters, and X denotes non-white space characters.

Note

This is a regex only challenge. You are not required to write code.
You have to fill the regex pattern in the blank (_________).
 */
public class Solution {
    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\S{2}\\s\\S{2}\\s\\S{2}"); // Use \\ instead of using \

    }
}