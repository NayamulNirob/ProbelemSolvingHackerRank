import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^(\\d{1,3})[- ](\\d{1,3})[- ](\\d{4,10})");
        for(int i=0;i<n;i++)
        {   Matcher matcher = pattern.matcher(scanner.nextLine());
            if (matcher.find())
            {   System.out.print("CountryCode="+matcher.group(1));
                System.out.print(",LocalAreaCode="+matcher.group(2));
                System.out.println(",Number="+matcher.group(3));
            }
        }
    }
}