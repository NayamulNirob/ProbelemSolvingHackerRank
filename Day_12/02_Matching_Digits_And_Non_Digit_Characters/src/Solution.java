/*
Task

You have a test string S. Your task is to match the pattern xxXxxXxxxx
Here x denotes a digit character, and X denotes a non-digit character.

Note

This is a regex only challenge. You are not required to write any code.
You only have to fill the regex pattern in the blank (_________).
 */

public class Solution {
    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\d{2}\\D\\d{2}\\D\\d{4}"); // Use \\ instead of using \
    }
}