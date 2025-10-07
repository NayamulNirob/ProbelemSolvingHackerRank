/*
Task

You have a test string S.
Your task is to write a regex which will match S, with following condition(s):

S consists of 8 digits.
S must have "---", "-", "." or ":" separator such that string S gets divided in 4 parts, with each part having exactly two digits.
S string must have exactly one kind of separator.
Separators must have integers on both sides.
Valid S

12-34-56-78
12:34:56:78
12---34---56---78
12.34.56.78
Invalid S

1-234-56-78
12-45.78:10
Note

This is a regex only challenge. You are not required to write any code.
You only have to fill the regex pattern in the blank (_________).
 */
public class Solution {
    public static void main(String[] args) {
        Regex_Test test = new Regex_Test();
        test.checker("^[0-9]{2}(-|:|---|\\.){1}[0-9]{2}\\1[0-9]{2}\\1[0-9]{2}$");
    }
}
