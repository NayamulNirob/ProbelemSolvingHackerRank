/*
25. Find A Sub-Word
 */
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sentenceBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sentenceBuilder.append(scanner.nextLine());
            sentenceBuilder.append("\n");
        }
        String sentence = sentenceBuilder.toString();
        int q = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < q; j++) {
            Pattern pattern = Pattern.compile(String.format("\\w%s\\w", scanner.nextLine()));
            Matcher matcher = pattern.matcher(sentence);
            Integer count = 0;
            while (matcher.find()) count++;
            System.out.println(count);
        }
    }
}