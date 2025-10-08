import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^[A-Z]{5}\\d{4}[A-Z]$");
        for (int i=0;i<n;i++)
        {   Matcher matcher = pattern.matcher(scanner.nextLine());
            if (matcher.find()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}