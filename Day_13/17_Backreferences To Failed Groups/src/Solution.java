/*
Task

You have a test string S.
Your task is to write a regex which will match S, with following condition(s):

S consists of 8 digits.
S may have "-" separator such that string  gets divided in  parts, with each part having exactly two digits. (Eg. 12-34-56-78)
Valid S

12345678
12-34-56-87
Invalid S

1-234-56-78
12-45-7810
Note

This is a regex only challenge. You are not required to write any code.
You only have to fill the regex pattern in the blank (_________).
 */
public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d{2}(-?)(\\d{2}\\1){2}\\d{2}$"); // Use \\ instead of using \ 

    
    }
}

