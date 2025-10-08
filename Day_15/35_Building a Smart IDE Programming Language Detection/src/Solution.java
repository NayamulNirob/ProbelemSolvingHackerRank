import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String output="";
        
        Pattern c_pattern = Pattern.compile("#include<stdio.h>");
        Pattern java_pattern = Pattern.compile("import java");
        Pattern python_pattern = Pattern.compile("(^print|def )");
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (c_pattern.matcher(line).find()) output="C";
            else  if (java_pattern.matcher(line).find()) output="Java";
            else  if (python_pattern.matcher(line).find()) output="Python";
            if(!output.equals(""))  break;
        }
        System.out.println(output);
    }
}