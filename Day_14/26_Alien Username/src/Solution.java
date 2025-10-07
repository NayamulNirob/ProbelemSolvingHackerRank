import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        sc.nextLine();


        String regex = "^[_\\.](?<=[_\\.])\\d+[a-zA-Z]*_?";
        Pattern p = Pattern.compile(regex);


        for (int i = 0; i < no; i++) {
            String s = sc.nextLine();

            if (p.matcher(s).matches()) {

                System.out.println("VALID");

            } else {
                System.out.println("INVALID");
            }
        }
    }
}