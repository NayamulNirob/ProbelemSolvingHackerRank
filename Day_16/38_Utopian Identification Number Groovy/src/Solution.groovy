import java.util.regex.*;

        def scanner = new Scanner(System.in);
        def n = Integer.parseInt(scanner.nextLine());
        def pattern = Pattern.compile("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}");
        for(int i=0;i<n;i++)
        {   def matcher = pattern.matcher(scanner.nextLine());
            if (matcher.find()) System.out.println("VALID");
            else   System.out.println("INVALID");
        }

