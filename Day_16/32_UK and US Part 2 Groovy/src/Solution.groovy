import java.util.regex.Pattern


def input = System.in.text.readLines()
def index = 0


def n = input[index++].toInteger()


def text = new StringBuilder()
n.times {
    text.append(input[index++]).append(" ")
}

def t = input[index++].toInteger()

t.times {
    def uk = new StringBuilder(input[index++])
    def idx = uk.indexOf("our")
    if (idx != -1) {
        uk.insert(idx + 2, '?')
    }

    def pattern = Pattern.compile("\\b${uk.toString()}\\b")
    def matcher = pattern.matcher(text.toString())
    def count = 0

    while (matcher.find()) {
        count++
    }

    println count
}
