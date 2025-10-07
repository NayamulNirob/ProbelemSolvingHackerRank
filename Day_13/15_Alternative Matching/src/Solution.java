/*
Task

Given a test string, S, write a RegEx that matches S under the following conditions:

S must start with Mr., Mrs., Ms., Dr. or Er..
The rest of the string must contain only one or more English alphabetic letters (upper and lowercase).
Note: This is a RegEx-only challenge. You are not required to write code; you simply need to fill in the blank.
 */
public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[A-Za-z]+$"); // Use \\ instead of using \ 
      
    
    }
}

