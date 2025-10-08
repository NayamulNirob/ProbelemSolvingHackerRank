import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

  public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int testCase = scan.nextInt();
                scan.nextLine();
                while (testCase > 0) {
                        String s = scan.nextLine();
                        Pattern r = Pattern.compile("^\\d{5,6}\\s(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$");

                        Matcher m = r.matcher(s);
                        if (m.find()) {
                                System.out.println("VALID");
                        } else {
                                System.out.println("INVALID");
                        }
                        testCase--;
                } 
        }
}