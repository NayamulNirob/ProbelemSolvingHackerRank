import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        String x = "([+-]?((90(\\.0+)?)|([1-8]?[0-9](\\.[0-9]+)?)))";
        String y = "([+-]?((180(\\.0+)?)|((1[0-7][0-9]|[1-9]?[0-9])(\\.[0-9]+)?)))";
        String regex = "^\\(" +x+ ",\s" +y+ "\\)$";
        Pattern pattern = Pattern.compile(regex);
        for(int i=0;i<n;i++)
        {   Matcher matcher = pattern.matcher(scanner.nextLine());
            if (matcher.find()) System.out.println("Valid");
            else System.out.println("Invalid");
        }
    }
}