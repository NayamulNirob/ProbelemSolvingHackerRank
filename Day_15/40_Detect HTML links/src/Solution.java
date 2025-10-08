import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "<a href\\s*=\\s*\"([^\"]+)\"[^>]*>(?:<[^<>]+>)*([^><]*)(?:<[^<>]+>)*";
        Pattern pattern = Pattern.compile(regex);
        for(int i=0;i<n;i++)
        {   Matcher matcher = pattern.matcher(scanner.nextLine());
            while(matcher.find())   
            {   System.out.print(matcher.group(1).trim());
                System.out.println(","+matcher.group(2).trim());
            }
        }
    }
}