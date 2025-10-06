import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Test {
    public void checker(String Regex_Pattern){
        Scanner input = new Scanner(System.in);
        String Test_String = input.nextLine();
        Pattern pattern = Pattern.compile(Regex_Pattern);
        Matcher matcher = pattern.matcher(Test_String);
        int count = 0;
        if(matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
