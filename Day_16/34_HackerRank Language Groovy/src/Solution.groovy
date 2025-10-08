import java.util.regex.Pattern

def scan = new Scanner(System.in)
def testCase = scan.nextInt()
scan.nextLine()

while (testCase > 0) {
    def s = scan.nextLine()

    def r = Pattern.compile('^\\d{5,6}\\s(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$')
    def m = r.matcher(s)

    if (m.find()) {
        println "VALID"
    } else {
        println "INVALID"
    }

    testCase--
}

