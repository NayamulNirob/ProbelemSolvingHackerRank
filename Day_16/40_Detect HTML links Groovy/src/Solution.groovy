import java.util.regex.*;

        def scanner = new Scanner(System.in);
        def n = Integer.parseInt(scanner.nextLine());
        def regex = "<a href\\s*=\\s*\"([^\"]+)\"[^>]*>(?:<[^<>]+>)*([^><]*)(?:<[^<>]+>)*";
        def pattern = Pattern.compile(regex);
        for(int i=0;i<n;i++)
        {   def matcher = pattern.matcher(scanner.nextLine());
            while(matcher.find())
            {   print(matcher.group(1).trim());
                println(","+matcher.group(2).trim());
            }
        }