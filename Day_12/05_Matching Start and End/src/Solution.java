/*
You have a test string S. Your task is to match the pattern Xxxxx
Here, x denotes a word character, and X denotes a digit.
S must start with a digit X and end with . symbol.
S should be 6 characters long only.
*/
public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d\\w{4}\\.$"); // Use \\ instead of using \
        }

}