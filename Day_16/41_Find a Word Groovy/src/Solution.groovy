import java.util.regex.*

def scanner = new Scanner(System.in)
def n = scanner.nextInt(); scanner.nextLine()
def sentences = new String[n]
for (int i = 0; i < n; i++) sentences[i] = scanner.nextLine()
def t = scanner.nextInt()
scanner.nextLine()
def output = new int[t]
for (int i = 0; i < t; i++) {
    def word = scanner.nextLine()
    output[i] = 0
    def regex = "(?<=^|[\\W])" + word + '(?=$|[\\W])'
    def pattern = Pattern.compile(regex)
    for (int j = 0; j < n; j++) {
        def matcher = pattern.matcher(sentences[j])
        while (matcher.find()) {
            output[i]++
        }
    }
}
for (int i = 0; i < t; i++) {
    println(output[i])
}
