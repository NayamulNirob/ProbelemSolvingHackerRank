import java.util.regex.*;

        def scanner = new Scanner(System.in)
        def n = Integer.parseInt(scanner.nextLine())
        def pattern = Pattern.compile('^(\\d{1,3})[- ](\\d{1,3})[- ](\\d{4,10})')
        for(int i=0;i<n;i++)
        {   def matcher = pattern.matcher(scanner.nextLine());
            if (matcher.find())
            {   print("CountryCode="+matcher.group(1));
                print(",LocalAreaCode="+matcher.group(2));
                println(",Number="+matcher.group(3));
            }
        }
