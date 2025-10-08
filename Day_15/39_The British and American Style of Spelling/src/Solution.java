import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        

        String input="";
        for(int i=0;i<n;i++)
            input=input+scanner.nextLine()+" ";
        
        int t = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<t;i++)
        {   String us_word = scanner.nextLine();
            String uk_word = us_word.replaceAll("ze$","se");
            Pattern pattern = Pattern.compile(us_word+"|"+uk_word);
            Matcher matcher = pattern.matcher(input);
            int count=0;
            while(matcher.find())
                count++;
            System.out.println(count);
        }
    }
}