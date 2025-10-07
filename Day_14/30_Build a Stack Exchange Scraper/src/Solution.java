import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String markup="";
        while (scanner.hasNextLine())   markup=markup+scanner.nextLine();

        Pattern pattern = Pattern.compile("question-summary-(\\d+).*?class=\"question-hyperlink\">(.*?)<.*?class=\"relativetime\">(.*?)</span>");
        Matcher matcher = pattern.matcher(markup);
        while(matcher.find())
            System.out.println(String.join(";",matcher.group(1),matcher.group(2),matcher.group(3)));
        
    }
}