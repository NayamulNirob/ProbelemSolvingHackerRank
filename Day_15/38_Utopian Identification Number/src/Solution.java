import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}");
        for(int i=0;i<n;i++)
        {   Matcher matcher = pattern.matcher(scanner.nextLine());
            if (matcher.find()) System.out.println("VALID");
            else   System.out.println("INVALID");
        }
    }
}