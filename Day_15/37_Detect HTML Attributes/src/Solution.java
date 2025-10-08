import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        Pattern tag_pattern = Pattern.compile("<(\\w+).*?>");
        Pattern attr_pattern = Pattern.compile("\\s(.*?)=[\"'].*?[\"']");
        
        TreeMap<String,TreeSet> tag_treemap = new TreeMap<String,TreeSet>(); 
        
        for(int i=0;i<n;i++){   
            Matcher tag_matcher = tag_pattern.matcher(scanner.nextLine());
            while(tag_matcher.find()){ 
                String full_tag = tag_matcher.group(0);
                String tag_name = tag_matcher.group(1);
                boolean attr_found=false;
                Matcher attr_matcher = attr_pattern.matcher(full_tag); 
                TreeSet<String> attr_treeset;
                if (tag_treemap.containsKey(tag_name))  
                    attr_treeset=tag_treemap.get(tag_name);
                else
                    attr_treeset = new TreeSet<String>();
                while(attr_matcher.find()){
                    String attr_name = attr_matcher.group(1);
                    attr_treeset.add(attr_name);
                    attr_found=true;    
                }
                tag_treemap.put(tag_name,attr_treeset);
            }
        }
        for(String key: tag_treemap.keySet()){   
            System.out.print(key+":");
            System.out.println(String.join(",",tag_treemap.get(key)));
        }
    }
}