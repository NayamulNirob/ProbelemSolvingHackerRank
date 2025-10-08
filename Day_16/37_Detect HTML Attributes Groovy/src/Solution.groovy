import java.util.regex.*;

        def scanner = new Scanner(System.in)
        def n = Integer.parseInt(scanner.nextLine())

        def tag_pattern = Pattern.compile("<(\\w+).*?>")
        def attr_pattern = Pattern.compile("\\s(.*?)=[\"'].*?[\"']")

        TreeMap<String, TreeSet> tag_treemap = new TreeMap<String,TreeSet>()

        for(int i=0;i<n;i++){
            def tag_matcher = tag_pattern.matcher(scanner.nextLine())
            while(tag_matcher.find()){
                def full_tag = tag_matcher.group(0)
                def tag_name = tag_matcher.group(1)
                def attr_found=false
                def attr_matcher = attr_pattern.matcher(full_tag)
                TreeSet<String> attr_treeset
                if (tag_treemap.containsKey(tag_name))
                    attr_treeset=tag_treemap.get(tag_name)
                else
                    attr_treeset = new TreeSet<String>()
                while(attr_matcher.find()){
                    def attr_name = attr_matcher.group(1)
                    attr_treeset.add(attr_name)
                    attr_found=true
                }
                tag_treemap.put(tag_name,attr_treeset)
            }
        }
        for(String key in tag_treemap.keySet()){
            print(key+":");
            println(String.join(",",tag_treemap.get(key)));
        }

