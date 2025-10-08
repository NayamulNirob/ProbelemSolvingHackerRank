//Enter your code here. Read input from STDIN. Print output to STDOUT
import java.util.regex.*;

def scanner = new Scanner(System.in);
def n = Integer.parseInt(scanner.nextLine());
def pattern = Pattern.compile('^[A-Z]{5}\\d{4}[A-Z]$');
for (int i=0;i<n;i++)
{   def matcher = pattern.matcher(scanner.nextLine());
    if (matcher.find()) println("YES");
    else println("NO");
}
    
