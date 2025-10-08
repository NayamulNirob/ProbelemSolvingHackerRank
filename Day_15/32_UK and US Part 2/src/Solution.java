import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
   
   public static void main(String[] args) throws IOException {
    
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       Pattern p;
       Matcher m;

       StringBuilder uk,str=new StringBuilder(); 
       for(int i=0;i<n;i++) str.append(br.readLine()+" ");
       str.toString();
       int t=Integer.parseInt(br.readLine());
       int count;
       for(int i=0;i<t;i++){
          uk=new StringBuilder((br.readLine()));
          uk.insert((uk.indexOf("our")+2),'?'); 
          p=Pattern.compile("\\b"+uk.toString()+"\\b");
          m=p.matcher(str);
          count=0;
          while(m.find()) ++count;
           System.out.println(count);      
        }
    }
}