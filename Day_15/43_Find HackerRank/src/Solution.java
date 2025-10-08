import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] fhr = new String[n];
    for(int i=0;i<n;i++){
        fhr[i] = sc.nextLine();
    }

    Pattern pattern = Pattern.compile("hackerrank");
    for(int i=0;i<n;i++){
        Matcher matcher = pattern.matcher(fhr[i]);
        if(matcher.find()){
            if(matcher.start()==0 && matcher.end()== fhr[i].length()) System.out.println("0");
            else if(matcher.end()== fhr[i].length())   System.out.println("2");
            else if(matcher.start()== 0)   System.out.println("1");
            else System.out.println("-1");
        }else System.out.println("-1");
    }
}
}