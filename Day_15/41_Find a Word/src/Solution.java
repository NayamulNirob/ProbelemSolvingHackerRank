import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine(); 
        String sentences[] = new String [n];
        for(int i=0;i<n;i++)    sentences[i]=scanner.nextLine();
        int t = scanner.nextInt(); scanner.nextLine(); 
        int output[] = new int [t];
        for(int i=0;i<t;i++)
        {   String word = scanner.nextLine(); 
            output[i]=0;
            String regex = "(?<=^|[\\W])" + word + "(?=$|[\\W])";
            Pattern pattern = Pattern.compile(regex);
            for(int j=0;j<n;j++)
            {   Matcher matcher = pattern.matcher(sentences[j]);
                while(matcher.find())   output[i]++;
            }
        }
        for(int i=0;i<t;i++)    System.out.println(output[i]);
    }
}