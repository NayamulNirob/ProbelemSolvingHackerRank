import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.nextLine();
        String u = "(25[0-5]|2[0-4]\\d|1?\\d?\\d)"; //0 to 255
        
        String regex_ipv4 = String.format("^(%s\\.){3}%s$",u,u); //u.u.u.u
        
        String v = "[a-fA-F0-9]{1,4}"; //4 hexadecimal digits
        
        String regex_ipv6 = String.format("^(%s\\:){7}%s$",v,v); //v:v:v:v:v:v:v:v (8 groups)
        
        Pattern pattern_ipv4 = Pattern.compile(regex_ipv4);
        Pattern pattern_ipv6 = Pattern.compile(regex_ipv6);
        
        for(int i=0;i<n;i++)
        {   String str = scanner.nextLine();
        
            Matcher matcher_ipv4 = pattern_ipv4.matcher(str);
            Matcher matcher_ipv6 = pattern_ipv6.matcher(str);
            
            if (matcher_ipv4.find()){ 
                System.out.println("IPv4");
                }
            
            else if (matcher_ipv6.find()){
                   System.out.println("IPv6");
                   }
                   
            else   { 
                System.out.println("Neither");
                }
        }
    }
}
