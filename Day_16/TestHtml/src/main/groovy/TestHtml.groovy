@Grab('org.jsoup:jsoup:1.17.2')
import org.jsoup.Jsoup

class TestHtml {
    static void main(String[]agrs) {

        def file = new File("resources/Simple.html")
        def doc = Jsoup.parse(file, "UTF-8")

        println doc
                .

                        title()
        println doc
                .

                        select("p")

                .

                        text()
    }
}