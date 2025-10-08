import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        Pattern pattern = Pattern.compile("^[Hh][Ii]\\s[^dD]");
        
        for(int i=0;i<n;i++)
        
        {   String str = scanner.nextLine();
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) System.out.println(str);
        }
    }
}