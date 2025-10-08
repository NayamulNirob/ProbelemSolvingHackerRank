
import java.util.regex.Pattern;

        Scanner scanner = new Scanner(System.in);
        String output="";

        def c_pattern = Pattern.compile("#include<stdio.h>");
        def java_pattern = Pattern.compile("import java");
        def python_pattern = Pattern.compile("(^print|def )");

        while(scanner.hasNextLine()){
            def line = scanner.nextLine();
            if (c_pattern.matcher(line).find()) output="C";
            else  if (java_pattern.matcher(line).find()) output="Java";
            else  if (python_pattern.matcher(line).find()) output="Python";
            if(!output.equals(""))  break;
        }
        println(output);


