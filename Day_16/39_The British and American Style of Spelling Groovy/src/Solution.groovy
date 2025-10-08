import java.util.regex.*;

        def scanner = new Scanner(System.in);
        def n = Integer.parseInt(scanner.nextLine());


        def input="";
        for(int i=0;i<n;i++)
            input=input+scanner.nextLine()+" ";

        def t = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<t;i++)
        {   def us_word = scanner.nextLine();
            def uk_word = us_word.replaceAll('ze$','se');
            def pattern = Pattern.compile(us_word+"|"+uk_word);
            def matcher = pattern.matcher(input);
            def count=0;
            while(matcher.find())
                count++;
            println(count);
        }
