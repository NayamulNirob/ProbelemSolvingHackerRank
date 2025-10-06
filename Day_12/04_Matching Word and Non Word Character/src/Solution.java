/*
Task

You have a test string S. Your task is to match the pattern xxxXxxxxxxxxxxXxxx
Here  denotes any word character and X denotes any non-word character.

Note

This is a regex only challenge. You are not required to write any code.
You only have to fill the regex pattern in the blank (_________).
 */
public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("\\w{3}\\W\\w{10}\\W\\w{3}"); // Use \\ instead of using \
    }
}