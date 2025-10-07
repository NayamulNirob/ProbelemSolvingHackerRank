/*
Task

You have a test string S.
Your task is to write a regex which will match S, with following condition(s):

S consists of tic or tac.
tic should not be immediate neighbour of itself.
The first tic must occur only when tac has appeared at least twice before.
Valid

tactactic
tactactictactic
Invalid

tactactictactictictac
tactictac
Note

This is a regex only challenge. You are not required to write any code.
You only have to fill the regex pattern in the blank (_________).
 */
public class Solution {

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^(\\2tic|(tac))+$"); // Use \\ instead of using \ "
    
    }
}

