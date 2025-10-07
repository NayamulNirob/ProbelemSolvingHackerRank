import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Test {

    public String checker(String Regex_Pattern) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(Regex_Pattern);
        SortedSet<String> ans = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                ans.add(matcher.group(1));
            }
        }

        String result = String.join(";", ans);
        System.out.println(result);
        return result;
    }
}