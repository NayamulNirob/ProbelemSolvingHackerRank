//def htmlFile = new File("/home/nayamul/Desktop/Traning/Day_16/my-groovy-html-reader/src/main/resources/simpleHTML.html")
//
//
//Scanner scanner = new Scanner(System.in);
//def markup = ""
//
//while (scanner.hasNextLine()) markup = markup + scanner.nextLine();
def sectiobBlockMatch = htmlFile= ~/question-summary-(\d+).*?class="question-hyperlink">(.*?)<.*?class="relativetime">(.*?)<\/span>/
//
//while (sectiobBlockMatch.find())
//    println(String.join(";", sectiobBlockMatch.group(1), sectiobBlockMatch.group(2), sectiobBlockMatch.group(3)));
//
//
////
////        if (!htmlFile.exists()) {
////            println "HTML file not found: ${htmlFile.absolutePath}"
////            return
////        }
////
////        // Parse the HTML using Jsoup
////        def doc = Jsoup.parse(htmlFile, "UTF-8")
////
////        // Example: extract all links and text
////        println "Page title: ${doc.title()}"
////        println "Links:"
////        doc.select("a[href]").each { link ->
////            println "- ${link.text()} => ${link.attr('href')}"
////        }
////
////        // Example: extract all images
////        println "\nImages:"
////        doc.select("img").each { img ->
////            println "- ${img.attr('src')}"
////        }
//
//def html = System.in.text
//
//def pattern = ~/question-summary-(\d+).*?class="question-hyperlink">(.*?)<.*?class="relativetime">(.*?)<\/span>/
//def matcher = html =~ pattern
//
//while (matcher.find()) {
//    def id = matcher.group(1).trim()
//    def title = matcher.group(2).trim()
//    def time = matcher.group(3).trim()
//    println "${id};${title};${time}"
//}

def scanner = new Scanner(System.in)
def markup = new StringBuilder()

while (scanner.hasNextLine()) {
    markup.append(scanner.nextLine()).append("\n")
}

def matcher = (markup.toString() =~ /(?is)question-summary-(\d+).*?class="question-hyperlink">\s*(.*?)\s*<.*?class="relativetime">\s*(.*?)\s*<\/span>/)

while (matcher.find()) {
    def id = matcher.group(1).trim()
    def question = matcher.group(2).replaceAll(/\s+/, ' ').trim()
    def time = matcher.group(3).replaceAll(/\s+/, ' ').trim()
    println "${id};${question};${time}"
}