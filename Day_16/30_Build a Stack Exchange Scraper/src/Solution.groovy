def  file =new File("src/simpleHTML.html")
if (file.exists()) {
    def htmlContent = file.text
    println htmlContent
} else {
    println "File not found!"
}

def htmlContent = getClass().getResource("src/simpleHTML.html").text
println htmlContent