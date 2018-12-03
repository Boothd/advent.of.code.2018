import java.io.File

fun main(args: Array<String>) {
    val fileName = "./src/day1.data"

    fun readFileLineByLineUsingForEachLine(fileName: String): Int {
        var number  = 0
        File(fileName).forEachLine {line: String ->
            number = number.plus(line.toInt()) }

        return number;
    }

    println(readFileLineByLineUsingForEachLine(fileName))
}