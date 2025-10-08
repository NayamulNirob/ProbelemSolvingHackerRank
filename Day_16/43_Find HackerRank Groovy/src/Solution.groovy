import java.util.regex.*


        def sc = new Scanner(System.in);
        def n = Integer.parseInt(sc.nextLine());
        def fhr = new String[n];
        for(int i=0;i<n;i++){
            fhr[i] = sc.nextLine();
        }

        def pattern = Pattern.compile("hackerrank");
        for(int i=0;i<n;i++){
            def matcher = pattern.matcher(fhr[i]);
            if(matcher.find()){
                if(matcher.start()==0 && matcher.end()== fhr[i].length()) println("0");
                else if(matcher.end()== fhr[i].length())   println("2");
                else if(matcher.start()== 0)   println("1");
                else println("-1");
            }else println("-1");
        }

