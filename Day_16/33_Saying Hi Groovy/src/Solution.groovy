import java.util.regex.Pattern;


        def scanner = new Scanner(System.in);
        def n = Integer.parseInt(scanner.nextLine());

        def pattern = Pattern.compile("^[Hh][Ii]\\s[^dD]");

        for(int i=0;i<n;i++) {
            def str = scanner.nextLine();
            def matcher = pattern.matcher(str);
            if (matcher.find()) {
                println(str)
            };
        }
